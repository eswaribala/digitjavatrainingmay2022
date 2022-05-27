package com.softura.donorapi.controllers;


import com.softura.donorapi.models.Donor;
import com.softura.donorapi.services.DonorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {
    @Autowired
    private DonorService donorService;

    //create the user
    @PostMapping({"/v1.0"})
    public ResponseEntity<?> addDonor(@RequestBody Donor donor){

        Donor donorObj=this.donorService.addDonor(donor);

       if(donorObj!=null)
        return ResponseEntity.status(HttpStatus.OK).body(donorObj);
       else
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Donor Not Created");
    }
    @GetMapping({"/v1.0"})
    public List<Donor> getAllDonors(){
        return this.donorService.getAllDonors();
    }

}
