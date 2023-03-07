package Week4.Overerving.Twee;

public class Main {
	public static void main(String[] args) {
		Persoon p1 = new Persoon("Hilde", 26);
		System.out.println(p1);

		Werknemer w1 = new Werknemer("Piet", 34, 1400.75);
		System.out.println(w1);

		Klant k1 = new Klant("Ashwin", 31, 75.50);
		System.out.println(k1);

		p1.jarig();
		w1.jarig();
		k1.jarig();

		System.out.println(p1);
		System.out.println(w1);
		System.out.println(k1);

		w1.verhoogSalaris(50);
		// p1.verhoogSalaris(50) werkt niet omdat Werknemer overerfd van Persoon, en niet andersom


	}

}
