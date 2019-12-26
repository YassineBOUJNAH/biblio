package com.company;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
        try {
            String host = "jdbc:mysql://localhost:3306/dotproject";
            String uName = "root";
            String uPass = "";
            Connection con = DriverManager.getConnection(host, uName, uPass);
        } catch (SQLException err) {
            System.out.println(err.getMessage());

        }
    }
}
