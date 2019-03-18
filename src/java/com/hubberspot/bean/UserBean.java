/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hubberspot.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Мария
 */
@ManagedBean
@SessionScoped
public class UserBean {

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String display(){
        return "display";
    }
}
