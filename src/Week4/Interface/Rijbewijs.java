package Week4.Interface;

public class Rijbewijs implements Legitimatiebewijs {
	private String naam;
	private String BSN;
	private String categorie;

	public Rijbewijs(String naam, String BSN, String categorie) {
		this.naam = naam;
		this.BSN = BSN;
		this.categorie = categorie;
	}

	public String getCategorie() {
		return this.categorie;
	}
	@Override
	public String getDocumentType() {
		return "Rijbewijs";
	}

	@Override
	public String getNaam() {
		return this.naam;
	}

	@Override
	public String getBSN() {
		return this.BSN;
	}

	@Override
	public String toString() {
		return "Rijbewijs{" +
				"naam='" + naam + '\'' +
				", BSN='" + BSN + '\'' +
				", categorie='" + categorie + '\'' +
				'}';
	}
}
