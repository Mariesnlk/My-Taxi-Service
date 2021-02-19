package com.mariia.syne.taxi_service.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

    private final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    //url: 3306 - standard port for MySQL, aviacompany_db - name of the DB.
    private final String URL = "jdbc:mysql://localhost:3306/taxi_service_db?autoReconnect=true&useSSL=false";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);//for MySQL database
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public static void main(String[] args) {
        DBHelper objectDBHelper = new DBHelper();

        System.out.println(objectDBHelper.getConnection());
    }
}