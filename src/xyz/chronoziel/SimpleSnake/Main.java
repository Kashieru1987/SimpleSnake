package xyz.chronoziel.SimpleSnake;

import javax.swing.SwingUtilities;

import xyz.chronoziel.SimpleSnake.SnakeEngine.SnakeEngine;

public class Main {

	public Main() {
		SwingUtilities.invokeLater(() -> {
			try {

				SnakeEngine.getInstance();

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public static void main(String[] args) {
		new Main();
	}

}
