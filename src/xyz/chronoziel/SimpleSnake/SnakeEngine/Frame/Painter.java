package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Painter {

	public Painter() {
	}

	public List<Consumer<Graphics2D>> getPaintList() {
		List<Consumer<Graphics2D>> paintList = new ArrayList<Consumer<Graphics2D>>();

		paintList.add(this::drawExample);

		return paintList;
	}

	public void drawExample(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.fillOval(10, 10, 100, 100);
	}

}
