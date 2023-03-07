package Week4.Interface;

public class Main {
	public static void main(String[] args) {
		Rijbewijs rijbewijs = new Rijbewijs("Auto", "923920", "B");
		System.out.println(rijbewijs.getBSN());
		System.out.println(rijbewijs.getDocumentType());

		Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
		persoon1.setRijbewijs(new Rijbewijs("Hannie", "29393202", "AM"));

		Persoon persoon2 = new Persoon(new Identiteitskaart("Jennie", "44320098"));

		Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));
		persoon3.setRijbewijs(null);



		System.out.println(persoon1);

		System.out.println(persoon2);

		System.out.println(persoon3);

		persoon1.toonOverzicht();
		persoon2.toonOverzicht();
		persoon3.toonOverzicht();
	}
}
