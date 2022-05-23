package com.softura.patientapp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbHelper {

    static Connection conn;
    static ResourceBundle resourceBundle;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        resourceBundle=ResourceBundle.getBundle("db");
        String userName=resourceBundle.getString("userName");
        String password=resourceBundle.getString("password");
        String url=resourceBundle.getString("url");
        String driver=resourceBundle.getString("driverClassName");
        Class.forName(driver);
        conn= DriverManager.getConnection(url,userName,password);
        return conn;
    }
}
