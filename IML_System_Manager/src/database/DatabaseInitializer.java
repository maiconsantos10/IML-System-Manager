package database;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void init() {

        try {

            Connection conn = DatabaseConnection.getConnection();

            Statement stmt = conn.createStatement();

            String sql = """
                    CREATE TABLE IF NOT EXISTS casos (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        numeroCaso VARCHAR(50),
                        nome VARCHAR(100),
                        causaMorte VARCHAR(100),
                        status VARCHAR(50)
                    );
                    """;

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}