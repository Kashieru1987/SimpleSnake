package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;

public class Painter {

	public Painter() {
	}

	public List<Consumer<Graphics2D>> getPaintList() {
		List<Consumer<Graphics2D>> paintList = new ArrayList<Consumer<Graphics2D>>();

		paintList.add(this::Board);
//		paintList.add(this::Snake);

		return paintList;
	}

	public void Board(Graphics2D g2) {
		final int boardSize = EngineConfig.BOARD_SIZE;
		final int cellSize = (int) ((double)EngineConfig.GAME_PANEL_WIDTH/boardSize);

		g2.setColor(Color.DARK_GRAY);
		for(int i = 0; i < boardSize; i++) {
			final int lineX = i * cellSize;
			PainterHelper.drawVerticalLine(g2, lineX);
			PainterHelper.drawHorizontalLine(g2, lineX);
		}

	}

//	public void Snake(Graphics2D g2) {
//	}

	private static class PainterHelper {

		private PainterHelper() {
		}

		private static void drawVerticalLine(Graphics2D g2, int x) {
			final int frameHeight = EngineConfig.SIZE.height;
			g2.drawLine(x, 0, x, frameHeight);
		}

		private static void drawHorizontalLine(Graphics2D g2, int y) {
			final int frameWidth = EngineConfig.SIZE.width;
			g2.drawLine(0, y, frameWidth, y);
		}

	}

}
