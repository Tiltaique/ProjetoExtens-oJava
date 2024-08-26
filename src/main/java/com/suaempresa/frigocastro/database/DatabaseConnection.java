package com.suaempresa.frigocastro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        if (url == null || user == null || password == null) {
            throw new IllegalStateException("As variáveis de ambiente DB_URL, DB_USER e DB_PASSWORD precisam estar definidas.");
        }

        return DriverManager.getConnection(url, user, password);
    }
}