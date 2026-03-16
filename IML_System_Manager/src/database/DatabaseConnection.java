package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:h2:./database/iml";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        try {

            Class.forName("org.h2.Driver");

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}