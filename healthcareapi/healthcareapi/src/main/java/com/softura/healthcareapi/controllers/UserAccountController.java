package com.softura.healthcareapi.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.softura.healthcareapi.models.UserAccount;
import com.softura.healthcareapi.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userAccounts")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;

    //create the user
    @PostMapping({"/v1.0"})
    public ResponseEntity<String> addUserAccount(@RequestBody UserAccount userAccount){

        UserAccount userAccountObj=this.userAccountService.addUserAccount(userAccount);
       Gson gson=new Gson();
       if(userAccountObj!=null)
        return ResponseEntity.status(HttpStatus.OK).body(gson.toJson(userAccountObj));
       else
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Account Not Created");
    }
    @GetMapping({"/v1.0"})
    public List<UserAccount> getAllUserAccounts(){
        return this.userAccountService.getAllUserAccount();
    }
    @GetMapping({"/v1.0/{userName}"})
    public ResponseEntity<?> getUserByUserName(@PathVariable("userName") String userName){
        UserAccount userAccountObj=this.userAccountService.getUserAccountByName(userName);

        if(userAccountObj!=null)
            return ResponseEntity.status(HttpStatus.OK).body(userAccountObj);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Account Not Available");
    }

    @DeleteMapping({"/v1.0/{userName}"})
    public ResponseEntity<String> deleteUserByUserName(@PathVariable("userName") String userName){

        if(this.userAccountService.deleteUserAccountByName(userName))
            return ResponseEntity.status(HttpStatus.OK).body("User account deleted...");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Account Not Available");
    }
}
