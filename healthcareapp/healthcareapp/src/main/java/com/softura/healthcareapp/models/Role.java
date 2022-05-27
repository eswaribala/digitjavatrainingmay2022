package com.softura.healthcareapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {

    private int roleId;

    private String roleName;

    private List<UserAccount> userList;

}
