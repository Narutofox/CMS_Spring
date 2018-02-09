/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.models;

/**
 *
 * @author Naruto
 */
public class Notification {
    
    private NotificationType Type;
    private String Text;
    private String CssClass;
 
    public NotificationType getType() {
        return Type;
    }

    public void setType(NotificationType Type) {
        this.Type = Type;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public String getCssClass() {
        return this.Type.toString().toLowerCase();
    }    
   
}
