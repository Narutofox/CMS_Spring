/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.DAL;

import com.spring.cms_ivancicek.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MenuRepo extends JpaRepository<Menu, Long>{
    
}
