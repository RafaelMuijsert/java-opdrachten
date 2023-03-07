package ExtraOpdrachten.Figuren;

public class Cirkel extends Figuur {
	private int straal;
	public Cirkel(String kleur, int straal) {
		super(kleur);
		this.straal = straal;
	}

	public int getStraal() {
		return straal;
	}

	public void setStraal(int straal) {
		this.straal = straal;
	}

	@Override
	public double berekenOppervlakte() {
		return Math.PI * this.straal * this.straal;
	}

	@Override
	public String toString() {
		return String.format(
				"Dit is een cirkel met straal: %d ",
				this.straal
		) + super.toString();
	}
}
