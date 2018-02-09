/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.controllers;

import com.spring.cms_ivancicek.DAL.MenuRepo;
import com.spring.cms_ivancicek.models.Menu;
import com.spring.cms_ivancicek.models.Notification;
import com.spring.cms_ivancicek.models.NotificationType;
import com.spring.cms_ivancicek.models.RecordStatus;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")

public class AdminController {
    @Inject
    MenuRepo menuRepo;
    
    @RequestMapping("/Menus")
    public String menus(Model model) {
        model.addAttribute("Menus", menuRepo.findAll());
        return "Admin/menus";
    }
    
    @RequestMapping("/CreateMenu")
    public String createMenu(HttpServletRequest request, @ModelAttribute("menu")Menu menu, BindingResult result, Model model) {
        Notification notification = new Notification();
        if (result.hasErrors()) {
            notification.setText("Dogodila se pogreška");
            notification.setType(NotificationType.Error);
            request.getSession().setAttribute("notification", notification);
        }
         else{
             menu.setRecordStatus(RecordStatus.Active);
             menuRepo.saveAndFlush(menu);
             notification.setText("Podaci uspješno spremljeni");
            notification.setType(NotificationType.Success);
         }
        
        model.addAttribute("Menus", menuRepo.findAll());
        return "Admin/menus";
    }
}
