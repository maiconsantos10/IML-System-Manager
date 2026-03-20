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
            // Explicitly load the PostgreSQL driver class (optional for modern JDBC, but helpful for clear errors).
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Unable to connect to the PostgreSQL database. Make sure the PostgreSQL driver JAR is on the classpath and the DB is running.",
                    e);
        }
    }

}