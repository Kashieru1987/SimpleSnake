package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import javax.swing.JFrame;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;

public class SnakeFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5533038637139609033L;

	public SnakeFrame() {
		this.init();
	}

	public void init() {
		this.setTitle(EngineConfig.TITLE);
		this.setSize(EngineConfig.SIZE);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
