package Week4.Overerving.Twee;

public class Persoon {
	private String naam;
	private int leeftijd;

	public Persoon(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
	}

	public void jarig() {
		this.leeftijd++;
	}

	@Override
	public String toString() {
		return String.format("Dit is %s, leeftijd %d", this.naam, this.leeftijd);
	}
}
