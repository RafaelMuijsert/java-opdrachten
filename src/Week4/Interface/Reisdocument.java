package Week4.Interface;

public abstract class Reisdocument implements Legitimatiebewijs {
	protected String naam;
	protected String BSN;
	abstract String getGeldigeLanden();

	public Reisdocument(String naam, String BSN) {
		this.naam = naam;
		this.BSN = BSN;
	}

	public String getNaam() {
		return this.naam;
	}

	public String getBSN() {
		return this.BSN;
	}

	@Override
	public String toString() {
		return "Reisdocument{" +
				"naam='" + naam + '\'' +
				", BSN='" + BSN + '\'' +
				'}'
				+ "type: " + getDocumentType() + " geldig in " + getGeldigeLanden();
	}
}
