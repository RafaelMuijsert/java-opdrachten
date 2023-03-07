package ExtraOpdrachten.TowerOfHanoi;

import java.awt.*;
import java.util.ArrayList; // import the ArrayList class
public class Tower {
	private ArrayList<Piece> pieces = new ArrayList<Piece>();

	public Tower(int pieceCount) {
		for(int i = pieceCount; i > 0; i--) {
			this.pieces.add(new Piece(i));
		}

	}

	public Piece getTopPiece() {
		if(this.pieces.size() == 0) {
			return null;
		}
		return this.pieces.get(this.pieces.size() - 1);
	}

	public void placePieceOnTop(Piece piece) {
		pieces.add(piece);
	}

	public Piece takeTopPiece() {
		if(this.pieces.size() == 0) {
			return null;
		}
		int index = this.pieces.size() - 1;
		Piece piece = this.pieces.get(index);
		this.pieces.remove(index);
		return piece;
	}

	public int getPieceCount() {
		return this.pieces.size();
	}

	public String toString() {
		String[] pieces = new String[this.pieces.size()];
		for(int i = 0; i < this.pieces.size(); i++) {
			pieces[i] = this.pieces.get(i).toString();
		}
		return String.join(" ", pieces);
	}

	public void draw(Graphics g, int x, int y) {
		System.out.println("TOH.Tower");
	}
}
