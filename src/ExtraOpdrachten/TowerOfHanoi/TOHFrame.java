package ExtraOpdrachten.TowerOfHanoi;

import javax.swing.*;
import java.awt.*;

public class TOHFrame extends JFrame {
	private TowerOfHanoi game;

	public TOHFrame(int width, int height) {
		setTitle("TOH.Tower of Hanoi");
		setLayout(new FlowLayout());
		setSize(width, height);
		setResizable(false);
		JButton newGame = new JButton("New game");
		JButton resetGame = new JButton("Reset");
		TOHPanel panel = new TOHPanel(this);
		add(newGame);
		add(resetGame);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.game.draw();
		// hier komen de controls
		setVisible(true); // toont het venster
	}
	public TowerOfHanoi getGame() {
		return this.game;
	}
}
