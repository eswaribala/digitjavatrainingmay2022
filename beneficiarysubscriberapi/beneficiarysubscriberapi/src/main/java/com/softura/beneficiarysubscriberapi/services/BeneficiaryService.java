package com.softura.beneficiarysubscriberapi.services;

import com.softura.beneficiarysubscriberapi.facades.BeneficiarySubscriberFacade;
import com.softura.beneficiarysubscriberapi.models.Beneficiary;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService {

    @StreamListener(target = BeneficiarySubscriberFacade.channelName)
    public void consumeBeneficiaryData(Beneficiary beneficiary){
          System.out.println(beneficiary);
    }
}
