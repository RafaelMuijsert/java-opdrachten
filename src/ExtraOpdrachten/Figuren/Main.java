package ExtraOpdrachten.Figuren;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {

		Cirkel cirkel1 = new Cirkel("blauw", 10);
		System.out.println(cirkel1);

		Rechthoek rechthoek1 = new Rechthoek("groen", 8, 10);
		System.out.println(rechthoek1);

		Vierkant vierkant1 = new Vierkant("geel", 10);
		System.out.println(vierkant1);

		System.out.println("Oppervlakte cirkel: " + cirkel1.berekenOppervlakte());

		System.out.println("Oppervlakte rechthoek: " + rechthoek1.berekenOppervlakte());

		System.out.println("Oppervlakte vierkant: " + vierkant1.berekenOppervlakte());

		vierkant1.setBreedte(40);
		System.out.println(vierkant1);

		ArrayList<Figuur> figuren = new ArrayList<>();
		Collections.addAll(figuren, cirkel1, rechthoek1, vierkant1);

		for(Figuur figuur: figuren) {
			if(figuur instanceof Cirkel) {
				System.out.println(
						new DecimalFormat("0.00").format(
								figuur.berekenOppervlakte()
						)
				);
			} else if(figuur instanceof Rechthoek) {
				System.out.println((int)figuur.berekenOppervlakte());
			}
		}

		Figuur vierkant2 = new Vierkant("groen", 10);
		// Vierkant figuur = new Figuur("groen"); kan niet




	}
}
