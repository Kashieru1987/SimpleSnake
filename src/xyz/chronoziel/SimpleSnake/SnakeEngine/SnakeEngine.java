package xyz.chronoziel.SimpleSnake.SnakeEngine;

import xyz.chronoziel.SimpleSnake.SnakeEngine.Frame.MainFrame;
import xyz.chronoziel.SimpleSnake.SnakeEngine.Snake.Snake;

public class SnakeEngine {

	private volatile static SnakeEngine instance;
	private Snake snake;
	private MainFrame snakeFrame;

	private SnakeEngine() {
		snake = new Snake();
		snakeFrame = new MainFrame();
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

	public Snake getSnake() {
		return this.snake;
	}

}
