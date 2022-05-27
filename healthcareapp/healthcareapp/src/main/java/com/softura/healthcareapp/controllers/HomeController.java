package com.softura.healthcareapp.controllers;

import com.softura.healthcareapp.models.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${apiUrl}")
    private String apiUrl;
    @GetMapping("/")
    public String loadHome(Model model){
        //System.out.println("Entering home...");
        model.addAttribute("userAccount", new UserAccount());
        return "index";
    }

    @GetMapping("/appointments")
    public String loadAppointments(){
        //System.out.println("Entering home...");
        //model.addAttribute("userAccount", new UserAccount());
        return "appointment";
    }
    @PostMapping("/login")
    public String loginValidation(@ModelAttribute("userAccount") UserAccount userAccount)
    {
        if(userAccount.getUserName().length()>5) {
            System.out.println("User Name" + userAccount.getUserName());
            ResponseEntity<UserAccount> responseEntity=restTemplate
                    .exchange(apiUrl+userAccount.getUserName(), HttpMethod.GET,
                    null,UserAccount.class);
            UserAccount userAccountObj= responseEntity.getBody();
            if (userAccountObj!=null){
               return  "redirect:/appointments";
            }

        }
        else
            System.out.println("User Name Not Valid");
        return "redirect:/";

    }

}
