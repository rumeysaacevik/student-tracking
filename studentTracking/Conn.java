package com.mycompany.cp2projectt;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rümeysa
 */
public class Conn {

    private static final String URL = "jdbc:mysql://localhost:3306/studenttracking?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "20072002";

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("connected!");
            } catch (SQLException ex) {
                Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }

    static PreparedStatement preparedStatement(String selectQuery) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
