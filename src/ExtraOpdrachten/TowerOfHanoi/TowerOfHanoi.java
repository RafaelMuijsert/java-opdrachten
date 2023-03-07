package ExtraOpdrachten.TowerOfHanoi;

import java.awt.*;

public class TowerOfHanoi {
	private Tower[] towers;
	private Piece pieceInHand;
	private int pieceCount;

	public TowerOfHanoi(int pieceCount) {
		this.pieceCount = pieceCount;
		this.towers = new Tower[3];
		this.towers[0] = new Tower(pieceCount);
		this.towers[1] = new Tower(0);
		this.towers[2] = new Tower(0);
	}

	public boolean isHoldingPiece() {
		return this.pieceInHand != null;

	}

	public static boolean isValidTower(int tower) {
		return tower >= 1 && tower <= 3;
	}
	public boolean tryTake(int tower) {
		if(!isValidTower(tower)) {
			System.out.println(tower);
			System.out.println("Invalid tower");
			return false;
		}
		tower--;
		if(isHoldingPiece()) {
			System.out.println("You are already holding a piece");
			return false;
		}

		if(this.towers[tower].getPieceCount() == 0) {
			System.out.println("This tower has no more pieces left");
			return false;
		}

		this.pieceInHand = this.towers[tower].takeTopPiece();
		return true;
	}

	public boolean tryPlace(int tower) {
		if(!isValidTower(tower)) {
			System.out.println("This tower is not valid");
			return false;
		}
		tower--;
		if(!isHoldingPiece()) {
			System.out.println("You are not holding a piece");
			return false;
		}
		if(this.towers[tower].getTopPiece() != null && this.towers[tower].getTopPiece().getSize() < this.pieceInHand.getSize()) {
			System.out.println("Your piece is higher than the target tower");
			return false;
		}
		this.towers[tower].placePieceOnTop(this.pieceInHand);
		this.pieceInHand = null;
		return true;
	}

	public boolean isWon() {
		return this.towers[2].getPieceCount() == this.pieceCount;
	}

	public boolean getPieceCount() {
		return true;
	}

	public String toString() {
		String result = "TOH.Tower 1: " + this.towers[0].toString() + "\n";
		result += "TOH.Tower 2: " + this.towers[1].toString() + "\n";
		result += "TOH.Tower 3: " + this.towers[2].toString() + "\n";
		result += "Hand: " + (this.isHoldingPiece() ? this.pieceInHand.toString() : "empty");
		return result;
	}

	public void draw(Graphics g) {
		System.out.println("Draw");
		g.drawRect(50, 50, 30, 30);

	}

}
