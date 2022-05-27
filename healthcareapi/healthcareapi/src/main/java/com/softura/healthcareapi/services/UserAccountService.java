package com.softura.healthcareapi.services;

import com.softura.healthcareapi.models.UserAccount;
import com.softura.healthcareapi.repositories.UserAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    @Autowired
    private UserAccountRepo userAccountRepo;

    //create
    public UserAccount addUserAccount(UserAccount userAccount){
        return this.userAccountRepo.save(userAccount);
    }

    //select all

    public List<UserAccount> getAllUserAccount(){
        return this.userAccountRepo.findAll();
    }

    //select by id

    public UserAccount getUserAccountByName(String name){
        return this.userAccountRepo.findById(name).orElse(null);
    }


    //delete
    public boolean deleteUserAccountByName(String name){
        boolean status=false;
        this.userAccountRepo.deleteById(name);
       if(this.getUserAccountByName(name) ==null){
           status=true;
       }
       return status;
    }


}
