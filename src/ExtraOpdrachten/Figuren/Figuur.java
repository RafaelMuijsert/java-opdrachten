package ExtraOpdrachten.Figuren;

// Abstracte klassen hebben de bijzondere eigenschap dat je er geen objecten van kunt maken
public abstract class Figuur {
	private String kleur;

	public Figuur(String kleur) {
		this.kleur = kleur;
	}

	public abstract double berekenOppervlakte();

	@Override
	public String toString() {
		return String.format("kleur (%s)", this.kleur);
	}
}
