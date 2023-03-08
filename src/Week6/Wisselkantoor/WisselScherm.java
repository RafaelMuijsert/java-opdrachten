package Week6.Wisselkantoor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WisselScherm extends JFrame implements ActionListener {
	static final int WINDOW_WIDTH = 400;
	static final int WINDOW_HEIGHT = 300;

	private Wisselkoers wisselkoers;
	private JTextField jtEuro;
	private JTextField jtDollar;

	private JButton jbWisselRechts;
	private JButton jbWisselLinks;
	public WisselScherm(Wisselkoers wisselkoers) {
		this.wisselkoers = wisselkoers;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLayout(new FlowLayout());
		add(new JLabel("€"));
		this.jtEuro = new JTextField("", 4);
		add(this.jtEuro);
		this.jbWisselRechts = new JButton(">>");
		this.jbWisselRechts.addActionListener(this);
		add(this.jbWisselRechts);
		this.jbWisselLinks = new JButton("<<");
		this.jbWisselLinks.addActionListener(this);
		add(this.jbWisselLinks);
		add(new JLabel("$"));
		this.jtDollar = new JTextField("", 4);
		add(this.jtDollar);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == this.jbWisselRechts) {
				double bedrag = Double.parseDouble(jtEuro.getText());
				this.jtDollar.setText(String.valueOf(wisselkoers.munt1NaarMunt2(bedrag)));
			} else if(e.getSource() == this.jbWisselLinks) {
				double bedrag = Double.parseDouble(jtDollar.getText());
				this.jtEuro.setText(String.valueOf(wisselkoers.munt2NaarMunt1(bedrag)));
			}
		} catch (Exception exception) {
			System.out.println("Ongeldig getal ingevoerd");
		}
	}
}
