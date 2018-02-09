/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.DAL;

import com.spring.cms_ivancicek.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author programer10
 */
public interface UserRepo extends JpaRepository<User, Long> {
}
