package Week4.Overerving.Twee;

public class Klant extends Persoon {
	double budget;
	public Klant(String naam, int leeftijd, double budget) {
		super(naam, leeftijd);
		this.budget = budget;
	}

	public void verhoogBudget(double bedrag) {
		this.budget += bedrag;
	}

	@Override
	public String toString() {
		return super.toString() + " (budget " + this.budget + ")";
	}
}
