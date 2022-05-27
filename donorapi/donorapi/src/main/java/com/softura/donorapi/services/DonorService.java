package com.softura.donorapi.services;


import com.softura.donorapi.models.Donor;
import com.softura.donorapi.repositories.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepo donorRepo;

    //create
    public Donor addDonor(Donor donor){
        return this.donorRepo.save(donor);
    }

    //select all

    public List<Donor> getAllDonors(){
        return this.donorRepo.findAll();
    }

    //select by id

    public Donor getDonorByName(String name){
        return this.donorRepo.findById(name).orElse(null);
    }


    //delete
    public boolean deleteDonorAccountByName(String name){
        boolean status=false;
        this.donorRepo.deleteById(name);
       if(this.getDonorByName(name) ==null){
           status=true;
       }
       return status;
    }


}
