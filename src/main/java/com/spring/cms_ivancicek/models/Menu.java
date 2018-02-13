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
    private Long menuId;
    @NotNull
    private String name;
    
    private Long parentId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;
    
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long MenuId) {
        this.menuId = MenuId;
    }
   

    public void setName(String Name) {
        this.name = Name;
    }

    public void setParentId(Long ParentId) {
        this.parentId = ParentId;
    }

    public void setRecordStatus(RecordStatus RecordStatus) {
        this.recordStatus = RecordStatus;
    }

    public String getName() {
        return name;
    }

    public Long getParentId() {
        return parentId;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }
    
}
