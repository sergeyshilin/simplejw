/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleapp.user;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;

/**
 *
 * @author snape
 */

@Stateless
public class User implements Serializable {
    private String name;

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}