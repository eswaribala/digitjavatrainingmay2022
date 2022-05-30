package com.softura.beneficiarysubscriberapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiary {

    private String beneficiaryName;
    private String email;
    private long mobileNo;
    private String ifscCode;
    private long accountNo;

}
