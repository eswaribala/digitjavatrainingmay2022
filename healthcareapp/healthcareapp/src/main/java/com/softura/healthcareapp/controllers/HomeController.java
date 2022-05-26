package com.softura.healthcareapp.controllers;

import com.softura.healthcareapp.models.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String loadHome(Model model){
        //System.out.println("Entering home...");
        model.addAttribute("userAccount", new UserAccount());
        return "index";
    }

    @PostMapping("/login")
    public String loginValidation(@ModelAttribute("userAccount") UserAccount userAccount)
    {
        if(userAccount.getUserName().length()>5)
         System.out.println("User Name"+ userAccount.getUserName());
        else
            System.out.println("User Name Not Valid");
        return "redirect:/";

    }

}
