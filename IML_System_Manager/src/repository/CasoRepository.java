package repository;

public class CasoRepository {
package repository;

import database.DatabaseConnection;
import entities.Caso;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CasoRepository {

    public void salvarCaso(Caso caso) {

        String sql = "INSERT INTO casos (numeroCaso, nome, causaMorte, status) VALUES (?, ?, ?, ?)";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, caso.getNumeroCaso());
            stmt.setString(2, caso.getCorpo().getNome());
            stmt.setString(3, caso.getCorpo().getCausaDaMorte());
            stmt.setString(4, caso.getStatus());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
}
