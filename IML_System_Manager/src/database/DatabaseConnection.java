package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    // Configure via environment variables or fall back to sensible defaults.
    // Example env vars:
    //   DB_URL=jdbc:postgresql://localhost:5432/iml_db
    //   DB_USER=postgres
    //   DB_PASSWORD=your_password_here
    private static final String URL = System.getenv().getOrDefault("DB_URL", "jdbc:postgresql://localhost:5432/iml_db");
    private static final String USER = System.getenv().getOrDefault("DB_USER", "postgres");
    private static final String PASSWORD = System.getenv().getOrDefault("DB_PASSWORD", "Maiconpf2019@");

    public static Connection getConnection() {
        try {
            loadDriver();
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Unable to connect to the database at " + URL
                            + ". Make sure the correct JDBC driver JAR is on the classpath and the database is running.",
                    e);
        }
    }

    private static void loadDriver() throws ClassNotFoundException {
        if (URL.startsWith("jdbc:postgresql:")) {
            Class.forName("org.postgresql.Driver");
            return;
        }

        if (URL.startsWith("jdbc:h2:")) {
            Class.forName("org.h2.Driver");
        }
    }

}
