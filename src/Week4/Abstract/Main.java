package Week4.Abstract;

public class Main {
	public static void main(String[] args) {
		// Dit is een kut opdracht. Veel succes!
		Postcode.createPostcode("9300 AB","GROENSTAD","De Brink");
		Postcode.createPostcode("9999 AA","DENSTRUIK","Postbus");
		Postcode.createPostcode("9234 MS","ZwOLLE","Centuurbaan");
		Persoon nynke = new NatuurlijkPersoon('V',"N","Nynke","Sluis","van der",
				Postcode.findPostcode("9300 AB"), 105, "-206");
		NatuurlijkPersoon aad = new NatuurlijkPersoon('M',"ABCD","Aad","Zalm",
				Postcode.findPostcode("9234 MS"), 562);
		Persoon maasLogistiek = new Rechtspersoon("Maasstad Nederland BV",
				"logistiek", Postcode.findPostcode("9999 AA"), 1100, aad);
		System.out.println("Voorbeeld natuurlijk persoon:");
		System.out.println(nynke.getAan());
		System.out.println("\nBetreft: kennismaking\n");
		System.out.println(nynke.getGeachte());
		System.out.println("Voorbeeld bedrijf:");
		System.out.println(maasLogistiek.getAan());
		System.out.println("\nBetreft: kennismaking\n");
		System.out.println(maasLogistiek.getGeachte());
	}
}
