package com.softura.beneficiaryreqapi.facades;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BeneficiaryFacade {

    String channelName="beneficiary-out";
    @Output(channelName)
    MessageChannel outChannel();
}
