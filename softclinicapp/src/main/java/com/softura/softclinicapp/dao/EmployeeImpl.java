package com.softura.softclinicapp.dao;

import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.utility.FileHelper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeImpl implements EmployeeDao{

   private FileHelper fileHelper;
   private  File file;
   private BufferedWriter bufferedWriter;

    @Override
    public void addEmployees(Employee[] employees) throws IOException {

        file= FileHelper.generateFile();
        bufferedWriter=new BufferedWriter(new FileWriter(file));
        for(Employee employee : employees) {

            bufferedWriter.write(employee.getUserName() + ",");
            bufferedWriter.write(employee.getPassword() + "\n");
          //  bufferedWriter.write(employee.getAdharCard() + ",");
            //bufferedWriter.write(employee.getEmail() + "\n");
        }
        bufferedWriter.close();



    }
}
