package main;

import database.DatabaseConnection;
import database.DatabaseInitializer;
import java.sql.Connection;
import ui.MainFrame;

public class Main {
	public static void main(String[] args) {
		
		DatabaseInitializer.init();

		Connection conn = DatabaseConnection.getConnection();

		if (conn != null) {
			System.out.println("Database Connection Successfull!");
		} else {
			System.out.println("Database Connection Failed!");
			return;
		}

		new MainFrame();
	}
}
