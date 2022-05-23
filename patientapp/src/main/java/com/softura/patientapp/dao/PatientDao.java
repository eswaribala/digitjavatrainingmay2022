package com.softura.patientapp.dao;

import com.softura.patientapp.models.Patient;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface PatientDao {

    void createPatient(Patient patient) throws SQLException, ClassNotFoundException;
    void createPatients(List<Patient> patients) throws SQLException, ClassNotFoundException;

    List<Patient> getAllPatients() throws SQLException;

    Patient getPatientById(int patientNo) throws SQLException;

    void updatePatientById(int patientNo, LocalDate doa) throws SQLException;

    LocalDate getCallablePatientById(int patientNo) throws SQLException;
}
