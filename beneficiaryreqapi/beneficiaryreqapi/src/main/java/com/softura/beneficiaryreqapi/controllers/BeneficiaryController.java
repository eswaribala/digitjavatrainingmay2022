package com.softura.beneficiaryreqapi.controllers;

import com.softura.beneficiaryreqapi.models.Beneficiary;
import com.softura.beneficiaryreqapi.services.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiaryController {
    @Autowired
    private BeneficiaryService beneficiaryService;
    @PostMapping({"/v1.0"})
    public ResponseEntity<String> publishBeneficiary(@RequestBody Beneficiary beneficiary){
        if(this.beneficiaryService.publishBeneficiary(beneficiary))
            return ResponseEntity.status(HttpStatus.OK).body("Beneficiary data published... ");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Beneficiary data not published... ");
    }



}
