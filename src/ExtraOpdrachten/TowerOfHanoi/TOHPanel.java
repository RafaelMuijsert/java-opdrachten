package ExtraOpdrachten.TowerOfHanoi;

import javax.swing.*;
import java.awt.*;

public class TOHPanel extends JPanel {
	private TOHFrame frame;
	public TOHPanel(TOHFrame frame) {
		this.frame = frame;
		setPreferredSize(new Dimension(1000, 500));
		setBackground(new Color(180, 180, 180));
	}
}
