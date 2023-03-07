package Week4.Overerving.Twee;

public class Werknemer extends Persoon {
	double salaris;

	public Werknemer(String naam, int leeftijd, double salaris) {
		super(naam, leeftijd);
		this.salaris = salaris;
	}

	public void verhoogSalaris(double bedrag) {
		this.salaris += bedrag;
	}

	@Override
	public String toString() {
		return super.toString() + " (salaris " + this.salaris + ")";
	}
}

