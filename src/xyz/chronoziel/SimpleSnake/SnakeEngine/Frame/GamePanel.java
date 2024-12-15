package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.JPanel;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private final List<Consumer<Graphics2D>> paintList;

	public GamePanel(List<Consumer<Graphics2D>> paintList) {
		this.init();

		this.paintList = paintList;
	}

	private void init() {
		this.setBackground(EngineConfig.GAME_BACKGROUND_COLOR);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for(Consumer<Graphics2D> item : paintList) {
			item.accept(g2);
		}

	}

}
