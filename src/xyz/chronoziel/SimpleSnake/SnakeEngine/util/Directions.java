package xyz.chronoziel.SimpleSnake.SnakeEngine.util;

public enum Directions {

	NORTH(new Vector2D(0, -1)),
	EAST(new Vector2D(1, 0)),
	SOUTH(new Vector2D(0, 1)),
	WEST(new Vector2D(-1, 0));

	private Vector2D direction;

	private Directions(Vector2D direction) {
		this.direction = direction;
	}

	public Vector2D getDirectionVector() {
		return this.direction;
	}

}
