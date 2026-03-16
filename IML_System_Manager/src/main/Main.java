package main;

import database.DatabaseInitializer;
import ui.MainFrame;

public class Main {
	public static void main(String[] args) {
		
		DatabaseInitializer.init();

		new MainFrame();
	}
}
