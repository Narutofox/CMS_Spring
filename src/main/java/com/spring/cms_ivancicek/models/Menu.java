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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Menus", schema = "dbo")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;
    @NotNull
    private String name;
    private Integer parentId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;
    
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int MenuId) {
        this.menuId = MenuId;
    }
   

    public void setName(String Name) {
        this.name = Name;
    }

    public void setParentId(Integer ParentId) {
        this.parentId = ParentId;
    }

    public void setRecordStatus(RecordStatus RecordStatus) {
        this.recordStatus = RecordStatus;
    }
}
