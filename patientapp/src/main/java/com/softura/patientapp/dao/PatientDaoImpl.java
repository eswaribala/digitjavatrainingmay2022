package com.softura.patientapp.dao;

import com.softura.patientapp.helper.DbHelper;
import com.softura.patientapp.models.Patient;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PatientDaoImpl implements PatientDao{

    private Connection conn=null;
    private PreparedStatement pre;

    private Statement statement;

    private ResourceBundle resourceBundle;

    private ResultSet resultSet;

    private CallableStatement callableStatement;

    private String query;
    public PatientDaoImpl(){
        resourceBundle=ResourceBundle.getBundle("db");
    }



    @Override
    public void createPatient(Patient patient) throws SQLException {
        query=resourceBundle.getString("addPatient");
        try {
            conn=  DbHelper.getConnection();
            if(conn!=null) {
                System.out.println("DB Connection created....");
                pre=conn.prepareStatement(query);
                pre.setLong(1,patient.getPatientNo());
                pre.setDate(2, Date.valueOf(patient.getDoa()));
                pre.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            conn.close();
        }


    }

    @Override
    public void createPatients(List<Patient> patients) throws SQLException, ClassNotFoundException {
        query=resourceBundle.getString("addPatient");
        System.out.println(patients.size());
        try {
            conn=  DbHelper.getConnection();
            if(conn!=null) {
                System.out.println("DB Connection created....");
                pre = conn.prepareStatement(query);
                conn.setAutoCommit(false);
                for(Patient patient : patients) {

                    pre.setLong(1, patient.getPatientNo());
                    pre.setDate(2, Date.valueOf(patient.getDoa()));
                    pre.addBatch();
                }
                pre.executeBatch();
                conn.commit();
            }
        } catch (SQLException e) {

            conn.rollback();
        } catch (ClassNotFoundException e) {
            conn.rollback();
        }
        finally
        {
            conn.close();
        }

    }

    @Override
    public List<Patient> getAllPatients() throws SQLException {
        query=resourceBundle.getString("getAllPatients");
        List<Patient> patients=new ArrayList<>();
        Patient patient=null;
        try {
            conn=  DbHelper.getConnection();
            if(conn!=null) {
                System.out.println("DB Connection created....");
                statement=conn.createStatement();
                resultSet=statement.executeQuery(query);
                while(resultSet.next()){
                    patient=new Patient();
                    patient.setPatientNo(resultSet.getInt(1));
                    patient.setDoa(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd")
                            .format(resultSet.getDate(2))));
                    patients.add(patient);
                }
            }
        } catch (SQLException e) {


        } catch (ClassNotFoundException e) {

        }
        finally
        {
            conn.close();
        }

        return patients;
    }

    @Override
    public Patient getPatientById(int patientNo) throws SQLException {
        query=resourceBundle.getString("getPatientById");
        List<Patient> patients=new ArrayList<>();
        Patient patient=null;
        try {
            conn=  DbHelper.getConnection();
            if(conn!=null) {
                System.out.println("DB Connection created....");
                pre=conn.prepareStatement(query);
                pre.setInt(1,patientNo);
                resultSet=pre.executeQuery();
                resultSet.next();
                patient=new Patient();
                patient.setPatientNo(resultSet.getInt(1));
                patient.setDoa(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd")
                        .format(resultSet.getDate(2))));

            }
        } catch (SQLException e) {


        } catch (ClassNotFoundException e) {

        }
        finally
        {
            conn.close();
        }

        return patient;
    }

    @Override
    public void updatePatientById(int patientNo, LocalDate doa) throws SQLException {
        query=resourceBundle.getString("updatePatientById");

        try {
            conn=  DbHelper.getConnection();

            if(conn!=null) {
                System.out.println("DB Connection created....");
                conn.setAutoCommit(false);
                pre=conn.prepareStatement(query);
                pre.setDate(1,Date.valueOf(doa));
                pre.setInt(2,patientNo);
                pre.executeUpdate();
                conn.commit();
            }
        } catch (SQLException e) {
          conn.rollback();

        } catch (ClassNotFoundException e) {
           conn.rollback();
        }
        finally
        {
            conn.close();
        }


    }

    @Override
    public LocalDate getCallablePatientById(int patientNo) throws SQLException {
        LocalDate doa=null;
        try {
            conn=  DbHelper.getConnection();
            if(conn!=null) {
                System.out.println("DB Connection created....");
                callableStatement=conn.prepareCall("{call patientproc(?)}");
                callableStatement.setInt(1,patientNo);
                //callableStatement.registerOutParameter(2, Types.DATE);
                resultSet=callableStatement.executeQuery();
                resultSet.next();
                doa=LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd")
                        .format(resultSet.getDate(2)));

            }
        } catch (SQLException e) {


        } catch (ClassNotFoundException e) {

        }
        finally
        {
            conn.close();
        }

        return doa;
    }
}
