package ExtraOpdrachten.TowerOfHanoi;

import java.awt.*;

public class Piece {
	private int size;
	public Piece(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		return String.format("[%s%d%s]", "_".repeat(size), size, "_".repeat(size));
	}

	public void draw(Graphics g, int x, int y) {
		System.out.println("TOH.Piece");
	}
}
