package Week6.Wisselkantoor;

public class Munt {
	private String naam;
	private String teken;

	public Munt(String naam, String teken) {
		this.naam = naam;
		this.teken = teken;
	}

	public String getNaam() {
		return naam;
	}

	public String getTeken() {
		return teken;
	}
}
