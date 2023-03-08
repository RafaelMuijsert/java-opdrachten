package Week6.LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class GuiApplicatie extends JFrame {
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	public GuiApplicatie() {
		Dimension dimension = new Dimension(100, 50);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLayout(new BorderLayout());
		JLabel oost = new JLabel("oost");
		oost.setOpaque(true);
		oost.setBackground(Color.RED);
//		oost.setBounds(10,20,30,80);
//		oost.setPreferredSize(dimension);
		add(oost, BorderLayout.EAST);

		JLabel west = new JLabel("west");
		west.setOpaque(true);
		west.setBackground(Color.CYAN);
//		west.setBounds(50,80,30,80);
		add(west, BorderLayout.WEST);

		JLabel centrum = new JLabel("centrum");
		centrum.setOpaque(true);
		centrum.setBackground(Color.ORANGE);
//		centrum.setBounds(10,20,30,80);
//		centrum.setPreferredSize(dimension);
		add(centrum, BorderLayout.CENTER);

		JLabel noord = new JLabel("noord");
		noord.setOpaque(true);
		noord.setBackground(Color.GREEN);
//		noord.setBounds(100,20,30,80);
		add(noord, BorderLayout.NORTH);

		JLabel zuid = new JLabel("zuid");
		zuid.setOpaque(true);
		zuid.setBackground(Color.YELLOW);
		zuid.setPreferredSize(new Dimension(0, 100));
//		zuid.setBounds(200,200,30,80);
		add(zuid, BorderLayout.SOUTH);



		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
