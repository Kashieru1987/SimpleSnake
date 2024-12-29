package xyz.chronoziel.SimpleSnake.SnakeEngine.Frame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;
import xyz.chronoziel.SimpleSnake.SnakeEngine.SnakeEngine;
import xyz.chronoziel.SimpleSnake.SnakeEngine.Snake.Snake;
import xyz.chronoziel.SimpleSnake.SnakeEngine.util.Vector2D;

public class Painter {

	public Painter() {
	}

	public List<Consumer<Graphics2D>> getPaintList() {
		List<Consumer<Graphics2D>> paintList = new ArrayList<Consumer<Graphics2D>>();

		paintList.add(this::Board);
		paintList.add(this::Snake);

		return paintList;
	}

	public void Board(Graphics2D g2) {
		final int boardSize = EngineConfig.BOARD_SIZE;
		final int cellSize = PainterHelper.getCellSize();

		g2.setColor(Color.DARK_GRAY);
		for(int i = 0; i < boardSize; i++) {
			final int lineX = i * cellSize;
			PainterHelper.drawVerticalLine(g2, lineX);
			PainterHelper.drawHorizontalLine(g2, lineX);
		}

	}

	public void Snake(Graphics2D g2) {

		final SnakeEngine engine = SnakeEngine.getInstance();
		final Snake snake = engine.getSnake();

		final List<Vector2D> positions = snake.getPositions();

		for(Vector2D position : positions) {
			PainterHelper.drawSnakeCell(g2, position);
		}
	

	}

	private static class PainterHelper {

		private PainterHelper() {
		}

		private static int getCellSize() {
			final int boardSize = EngineConfig.BOARD_SIZE;
			final int cellSize = (int) ((double)EngineConfig.GAME_PANEL_WIDTH/boardSize);

			return cellSize;
		}

		private static void drawVerticalLine(Graphics2D g2, final int x) {
			final int frameHeight = EngineConfig.SIZE.height;
			g2.drawLine(x, 0, x, frameHeight);
		}

		private static void drawHorizontalLine(Graphics2D g2, final int y) {
			final int frameWidth = EngineConfig.SIZE.width;
			g2.drawLine(0, y, frameWidth, y);
		}

		private static void drawSnakeCell(Graphics2D g2, final Vector2D position) {
			final int cellX = position.getX();
			final int cellY = position.getY();

			final int cellSize = PainterHelper.getCellSize();

			final int x = cellX * cellSize;
			final int y = cellY * cellSize;

			g2.setColor(EngineConfig.SNAKE_COLOR);
			g2.fillRect(x, y, cellSize, cellSize);

		}

	}

}
