/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleapp.user;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author snape
 */

@Stateless
public class User {
    
    private String name;

    public void initUser(String name) {
        this.name = name;
    }

    
}
