package ExtraOpdrachten.Figuren;

public class Rechthoek extends Figuur {
	private int lengte;
	private int breedte;

	public Rechthoek(String kleur, int lengte, int breedte) {
		super(kleur);
		this.lengte = lengte;
		this.breedte = breedte;
	}

	public int getLengte() {
		return lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}

	@Override
	public double berekenOppervlakte() {
		return this.lengte * this.breedte;
	}

	@Override
	public String toString() {
		return String.format(
				"Dit is een rechthoek van: %dx%d ",
				this.lengte,
				this.breedte
		) + super.toString();
	}
}
