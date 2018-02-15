/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author programer10
 */
@Controller
//@RequestMapping("/Home")
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)  
    public String index(Model model,@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
         model.addAttribute("name", name);
        return "hello";
    }
}
