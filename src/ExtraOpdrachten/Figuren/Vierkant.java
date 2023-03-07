package ExtraOpdrachten.Figuren;

public class Vierkant extends Rechthoek {
	public Vierkant(String kleur, int lengte) {
		super(kleur, lengte, lengte);
	}

	@Override
	public void setBreedte(int breedte) {
		super.setBreedte(breedte);
		super.setLengte(breedte);
	}

	@Override
	public void setLengte(int lengte) {
		super.setLengte(lengte);
		super.setBreedte(lengte);
	}

	@Override
	public String toString() {
		return super.toString() + ", het is dus ook een vierkant";
	}
}
