package com.database.sportsutilityshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SingletonConnection {

    String databaseURL = "jdbc:ucanaccess://SportsShop.accdb";
    private static SingletonConnection instance;
    private Connection connection;
    
    private SingletonConnection() throws SQLException {
        this.connection = DriverManager.getConnection(databaseURL);   
    }

    public Connection getConnection() {
        return connection;
    }

    public static SingletonConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new SingletonConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new SingletonConnection();
        }

        return instance;
    }
}