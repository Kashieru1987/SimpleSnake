package xyz.chronoziel.SimpleSnake.SnakeEngine;

public class SnakeEngine {

	private volatile static SnakeEngine instance;

	private SnakeEngine() {
	}

	public SnakeEngine getInstance() {
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
