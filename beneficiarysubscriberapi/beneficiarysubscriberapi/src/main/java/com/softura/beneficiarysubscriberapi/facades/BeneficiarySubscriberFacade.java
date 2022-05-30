package com.softura.beneficiarysubscriberapi.facades;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BeneficiarySubscriberFacade {

    String channelName="beneficiary-in";

    @Input(channelName)
    MessageChannel inChannel();



}
