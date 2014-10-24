
package com.simpleapp.beans;

import com.simpleapp.user.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

   private User user;
   private String name;
   
   @PostConstruct
   private void init() {
       user = new User();
   }
   public void setUser(User user) {
       this.user = user;
   }
   public User getUser() {
       return this.user;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return this.name;
   }
}
