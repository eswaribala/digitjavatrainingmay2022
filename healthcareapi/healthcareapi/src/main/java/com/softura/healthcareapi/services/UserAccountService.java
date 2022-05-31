package com.softura.healthcareapi.services;

import com.softura.healthcareapi.models.Role;
import com.softura.healthcareapi.models.UserAccount;
import com.softura.healthcareapi.repositories.UserAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    @Autowired
    private UserAccountRepo userAccountRepo;
 @Autowired
    private PasswordEncoder passwordEncoder;
    //create
    public UserAccount addUserAccount(UserAccount userAccount){

        System.out.println(userAccount.getPassword());
        userAccount.setPassword(passwordEncoder.encode(userAccount.getPassword()));
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
    public UserAccount getUserByName(String name){
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
    public List<Role> getRoles(String userName)
    {
        UserAccount user =this.userAccountRepo.findById(userName).orElse(null);
        if(user!=null)
            return user.getRoles();
        else
            return null;
    }


}
