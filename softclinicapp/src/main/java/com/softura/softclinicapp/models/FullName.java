package com.softura.softclinicapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullName {

    private String firstName;
    private String middleName;
    private String lastName;
}
