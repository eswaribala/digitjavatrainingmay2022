package com.softura.softclinicapp.models;

import com.softura.softclinicapp.exceptions.EmployeeValidator;
import com.softura.softclinicapp.exceptions.UserNameException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {


    private String userName;
    private String password;
    private Department department;
    private LocalDate doj;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws UserNameException{

        if(EmployeeValidator.validateUserName(userName))
           this.userName = userName;
        else
        {
            throw new UserNameException("User Name should be only alphabets in the range of 5 to 25 chars");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public void onBoarding() {

    }


}
