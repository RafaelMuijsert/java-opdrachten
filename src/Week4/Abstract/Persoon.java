package Week4.Abstract;

public class Persoon {
	private Postcode postcode;
	protected int huisnummer;
	protected String toevoeging;

	// Idk of ik deze had moeten gebruiken maar de opdracht is tering vaag
	public String getAan() {
		return "";
	}

	public String getGeachte() {
		return "";
	}

	public String getAdres() {
		return "";
	}

	public void setPostcode(Postcode pc) {
		this.postcode = pc;
	}

	public Postcode getPostcode() {
		return this.postcode;
	}

	public String getWoonplaats() {
		return this.postcode.getWoonplaats();
	}
}
