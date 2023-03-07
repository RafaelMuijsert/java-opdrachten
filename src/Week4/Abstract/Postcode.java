package Week4.Abstract;

import java.util.ArrayList;
import java.util.Collections;

public class Postcode implements Comparable<Postcode> {
	private static ArrayList<Postcode> lijst = new ArrayList<Postcode>();
	private String code;
	private String woonplaats;
	private String straatnaam;
	public static void createPostcode(String pc, String wp, String sn) {
		Postcode lpc = Postcode.findPostcode(pc);
		if (lpc == null)
		{
			// niet te vinden: dus toevoegen aan de lijst
			lijst.add(new Postcode(pc, wp, sn));
			Collections.sort(lijst);
		}
		else
		{
			// al aanwezig in ons systeem, dus aleen updaten:
			lpc.setWoonplaats(wp);
			lpc.setStraatnaam(sn);
		}
	}
	public static Postcode findPostcode(String pc) {
		for(Postcode postcode : lijst) {
			int result = pc.compareTo(postcode.getCode());
			if(result > 0)
				// Als het resultaat van de vergelijking > 0 is, zijn we voorbij de postcode in de gesorteerde lijst
				// en zit deze er dus niet in
				return null;
			else if(result == 0)
				return postcode;
		}
		return null;

	}
	private Postcode(String pc, String wp, String sn)  {
		this.code = pc;
		this.woonplaats = wp;
		this.straatnaam = sn;
	}

	public String getCode() {
		return this.code;
	}

	public String getStraatnaam() {
		return this.straatnaam;
	}

	public void setStraatnaam(String sn) {
		this.straatnaam = sn;
	}

	public String getWoonplaats() {
		return this.woonplaats;
	}

	public void setWoonplaats(String wp) {
		this.woonplaats = wp;
	}

	public int compareTo(Postcode postcode) {
		// Vergelijkt de postcode met de eigen postcode om de lijst te sorteren
		return postcode.getCode().compareTo(this.getCode());
	}
}
