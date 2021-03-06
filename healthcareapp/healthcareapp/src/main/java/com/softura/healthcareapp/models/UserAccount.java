package com.softura.healthcareapp.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
    private String userName;
    private String password;
    private List<Role> roles;
}
