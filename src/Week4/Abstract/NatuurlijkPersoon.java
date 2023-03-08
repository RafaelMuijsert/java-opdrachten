package Week4.Abstract;

public class NatuurlijkPersoon extends Persoon{
	private final String achternaam;
	private String tussenvoegsel;
	private final String voornaam;
	private String voorletters;
	private final char geslacht;

	public NatuurlijkPersoon(char geslacht, String voorletters, String voornaam, String achternaam, String tussenvoegsel, Postcode postcode, int huisnummer, String toevoeging) {
		this(geslacht, voorletters, voornaam, achternaam, postcode, huisnummer);
		this.tussenvoegsel = tussenvoegsel;
		this.toevoeging = toevoeging;
	}

	public NatuurlijkPersoon(char geslacht, String voorletters, String voornaam, String achternaam, Postcode postcode, int huisnummer) {
		this.geslacht = geslacht;
		this.voorletters = "";
		for(char letter: voorletters.toCharArray()) {
			// Voeg voor elke voorletter de voorletter en een punt toe. voorletters ABCD -> A.B.C.D.
			this.voorletters = this.voorletters.concat(letter + ".");
		}
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.setPostcode(postcode);
		this.huisnummer = huisnummer;
	}
	public String getGeslacht() {
		if(this.geslacht == 'M') {
			return "heer";
		} else if(this.geslacht == 'V') {
			return "mevrouw";
		}
		return "?";
	}

	public String getVoorletters() {
		return this.voorletters;
	}
	public String getAan() {
		return String.format(
				"""
				Aan: %s %s %s
				%s %s
				%s %s
				""",
				this.getGeslacht(), this.voorletters, this.achternaam,
				this.getPostcode().getStraatnaam(), this.huisnummer,
				this.getPostcode().getCode(), this.getWoonplaats()
		);
	}

	public String getGeachte() {
		return String.format(
				"Geachte %s %s,",
				this.getGeslacht(),
				this.achternaam
		);
	}

	public String getAchternaam() {
		return this.achternaam;
	}
}
