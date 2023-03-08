package Week3;

public class Main {
	public static void main(String[] args) {
		// Opdracht 1: Circus Act

//		Artiest artiest1 = new Artiest("Koen");
//		Artiest artiest2 = new Artiest("Gert");
//		Artiest artiest3 = new Artiest("Guus");
//
//		Act act1 = new Act("Act een", 100);
//		Act act2 = new Act("Act twee", 100);
//
//		act1.voegArtiestToe(artiest1);
//		act1.voegArtiestToe(artiest2);
//
//		act2.voegArtiestToe(artiest3);
//		act2.voegArtiestToe(artiest2);
//
//		Circus circus1 = new Circus();
//		circus1.voegActToe(act1);


		// Opdracht 2: ArrayList en contains

		Act act = new Act("act 1", 60);
		Artiest artiest1 = new Artiest("artiest 1");
		act.voegArtiestToe(artiest1);
		Artiest artiest2 = new Artiest("artiest 2");
		act.voegArtiestToe(artiest2);
		Artiest artiest3 = new Artiest("artiest 3");
		act.voegArtiestToe(artiest3);
		act.voegArtiestToe(new Artiest("artiest 4"));
		// even kijken hoe de act eruit ziet:
		System.out.println(act);
		Artiest artiest2_copy = new Artiest("artiest 2");
		boolean antwoord = act.wordtUitgevoerdDoor(artiest2_copy);
		System.out.println("act door " + artiest2_copy + "? " + antwoord); // false
		antwoord = act.wordtUitgevoerdDoor(artiest3);
		System.out.println("act door " + artiest3 + "? " + antwoord);
		Artiest artiest4 = new Artiest("artiest 4");
		antwoord = act.wordtUitgevoerdDoor(artiest4);
		System.out.println("act door " + artiest4 + "? " + antwoord);

		Artiest artiest5 = new Artiest("dazn");
		antwoord = act.wordtUitgevoerdDoor(artiest5);
		System.out.println("act door " + artiest5 + "? " + antwoord); // false
	}
}
