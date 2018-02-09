/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MenuId;
    @NotNull
    private String Name;
    private Integer ParentId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RecordStatus RecordStatus;
    
    public int getMenuId() {
        return MenuId;
    }

    public void setMenuId(int MenuId) {
        this.MenuId = MenuId;
    }
   

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setParentId(Integer ParentId) {
        this.ParentId = ParentId;
    }

    public void setRecordStatus(RecordStatus RecordStatus) {
        this.RecordStatus = RecordStatus;
    }
}
