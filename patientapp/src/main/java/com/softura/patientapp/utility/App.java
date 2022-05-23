package com.softura.patientapp.utility;

import com.softura.patientapp.dao.PatientDao;
import com.softura.patientapp.dao.PatientDaoImpl;
import com.softura.patientapp.helper.DbHelper;
import com.softura.patientapp.models.Patient;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void addPatients(){
        PatientDao patientDao=new PatientDaoImpl();
        Patient patient=null;
        List<Patient> patients=new ArrayList<>();
        for(int i=101;i<200;i++){
          patient=new Patient();
          patient.setPatientNo(i);
          patient.setDoa(LocalDate.of(2022,5,1+new Random().nextInt(27)));
          patients.add(patient);
        }

        try {
            patientDao.createPatients(patients);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void getAllPatients()  {

        try {
            for(Patient patient : new PatientDaoImpl().getAllPatients()){
                System.out.println(patient);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getPatientById()  {

        try {
              System.out.println(new PatientDaoImpl().getPatientById(112));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updatePatientById()  {

        try {
            new PatientDaoImpl().updatePatientById(1,LocalDate.now());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getCallablePatientById()  {

        try {
            System.out.println(new PatientDaoImpl().getCallablePatientById(112));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){

       //addPatients();
       // getAllPatients();
       getCallablePatientById();
        //updatePatientById();
    }
}
