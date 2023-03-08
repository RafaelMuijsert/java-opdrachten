package Week6.Wisselkantoor;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Munt euro = new Munt("Euro", "€");
		Munt dollar = new Munt("Dollar", "$");
		Wisselkoers koers = new Wisselkoers(euro, dollar, 1.12);
		WisselScherm scherm = new WisselScherm(koers);
		scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
