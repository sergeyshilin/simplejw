/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleapp.beans;

import com.simpleapp.user.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author snape
 */

@SessionScoped
public class UserBean implements Serializable {

   private User user;
   
   @PostConstruct
   private void init() {
       user.initUser("Sergey Shilin");
   }
}
