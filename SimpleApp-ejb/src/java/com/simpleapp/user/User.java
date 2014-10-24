
package com.simpleapp.user;

import java.io.Serializable;
import javax.ejb.Stateless;

@Stateless
public class User implements Serializable {
    
    private String name;
    public User() {}
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
}
