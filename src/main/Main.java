package main;

import database.DatabaseConnection;
import database.DatabaseInitializer;
import java.sql.Connection;
import ui.MainFrame;

public class Main {
	public static void main(String[] args) {
		
		DatabaseInitializer.init();

		try (Connection conn = DatabaseConnection.getConnection()) {
			System.out.println("Database Connection Successfull!");
		} catch (Exception e) {
			System.out.println("Database Connection Failed!");
			e.printStackTrace();
			return;
		}

		new MainFrame();
	}
}
