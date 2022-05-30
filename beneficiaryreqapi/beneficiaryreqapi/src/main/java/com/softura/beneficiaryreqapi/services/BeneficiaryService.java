package com.softura.beneficiaryreqapi.services;

import com.softura.beneficiaryreqapi.facades.BeneficiaryFacade;
import com.softura.beneficiaryreqapi.models.Beneficiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService {
    @Autowired
    private BeneficiaryFacade beneficiaryFacade;

    public boolean publishBeneficiary(Beneficiary beneficiary){
        MessageChannel messageChannel=beneficiaryFacade.outChannel();
       return messageChannel.send(MessageBuilder.withPayload(beneficiary).build());
    }
}
