package Week4.Overerving.Een;

public class Persoon {
	private String naam;
	private int lengte;

	public Persoon(String naam, int lengte) {
		this.setNaam(naam);
		this.setLengte(lengte);
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLengte() {
		return this.lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}

	@Override
	public String toString() {
		return String.format("%s is %d cm lang", this.getNaam(), this.getLengte());
	}
}
