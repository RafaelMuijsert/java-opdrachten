package Week4.Abstract;

public class Rechtspersoon extends Persoon{
	String naam;
	String afdeling;
	NatuurlijkPersoon contactPersoon;

	public Rechtspersoon(String naam, String afdeling, Postcode postcode, int huisnummer, NatuurlijkPersoon contactPersoon) {
		this.naam = naam;
		this.afdeling = afdeling;
		this.setPostcode(postcode);
		this.huisnummer = huisnummer;
		this.contactPersoon = contactPersoon;
	}

	public String getAan() {
		return String.format(
				"""
    Aan: %s
    Afdeling %s
    De %s %s %s
    Postbus %s
    %s %s
				""",
				naam,
				afdeling,
				contactPersoon.getGeslacht(), contactPersoon.getVoorletters(), contactPersoon.getAchternaam(),
				huisnummer,
				getPostcode().getCode(), getWoonplaats()
		);
	}

	public String getGeachte() {
		return String.format(
				"Geachte %s %s,",
				this.contactPersoon.getGeslacht(),
				this.contactPersoon.getAchternaam()
		);
	}
}
