package xyz.chronoziel.SimpleSnake.SnakeEngine.Snake;

import java.util.ArrayList;
import java.util.List;

import xyz.chronoziel.SimpleSnake.SnakeEngine.EngineConfig;
import xyz.chronoziel.SimpleSnake.SnakeEngine.util.Vector2D;

public class Snake {

	private List<Vector2D> positions;

	public Snake() {
		this(Snake.getDefaultStartingPosition());
	}

	public Snake(final Vector2D startingPosition) {
		this.initSnake();

		positions.add(startingPosition);

	}

	public void initSnake() {
		positions = new ArrayList<Vector2D>();
	}

	public List<Vector2D> getPositions() {
		return this.positions;
	}

	private static Vector2D getDefaultStartingPosition() {
		final int boardSize = EngineConfig.BOARD_SIZE;
		final int boardCentre = boardSize / 2;

		final Vector2D output = new Vector2D(boardCentre, boardCentre);
		return output;
	}

}
