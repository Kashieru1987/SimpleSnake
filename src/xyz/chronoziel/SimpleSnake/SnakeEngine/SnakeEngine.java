package xyz.chronoziel.SimpleSnake.SnakeEngine;

import xyz.chronoziel.SimpleSnake.SnakeEngine.Frame.GamePanel;
import xyz.chronoziel.SimpleSnake.SnakeEngine.Frame.MainFrame;
import xyz.chronoziel.SimpleSnake.SnakeEngine.Frame.Painter;

public class SnakeEngine {

	private volatile static SnakeEngine instance;
	private MainFrame snakeFrame;

	private SnakeEngine() {
		snakeFrame = new MainFrame();
		snakeFrame.setVisible(true);
	}

	public static SnakeEngine getInstance() {
		SnakeEngine engineInstance = instance;
		if(engineInstance == null) {
			synchronized (SnakeEngine.class) {
				engineInstance = instance;
				if(engineInstance == null) {
					instance = engineInstance = new SnakeEngine();
				}
			}
		}

		return engineInstance;
	}

}
