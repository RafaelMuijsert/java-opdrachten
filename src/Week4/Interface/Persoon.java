package Week4.Interface;

// Spreekt allemaal wel voor zich.
public class Persoon {
	private String naam;
	private Rijbewijs rijbewijs;
	private Reisdocument reisdocument;

	public Persoon(Rijbewijs rijbewijs) {
		this.naam = rijbewijs.getNaam();
		this.rijbewijs = rijbewijs;
	}

	public Persoon(Reisdocument reisdocument) {
		this.naam = reisdocument.getNaam();
		this.reisdocument = reisdocument;
	}

	public void setRijbewijs(Rijbewijs rijbewijs) {
		this.rijbewijs = rijbewijs;
	}

	public void setReisdocument(Reisdocument reisdocument) {
		this.reisdocument = reisdocument;
	}

	public Legitimatiebewijs getLegitimatie() {
		if(this.rijbewijs != null) {
			return this.rijbewijs;
		} else if(this.reisdocument != null) {
			return this.reisdocument;
		}
		return null;
	}

	public void toonOverzicht() {
		Legitimatiebewijs legitimatiebewijs = this.getLegitimatie();
		if(legitimatiebewijs == null) {
			System.out.printf("%s, kan zich niet legitimeren", this.naam);
		} else {
			System.out.printf("%s, BSN: %s%n", this.naam, legitimatiebewijs.getBSN());
			if(this.rijbewijs != null) {
				System.out.printf("\tRijbewijs, categorie %s%n", this.rijbewijs.getCategorie());
			}
			if(this.reisdocument != null) {
				System.out.printf("\tReisdocument: %s, reizen in %s%n", this.reisdocument.getDocumentType(), this.reisdocument.getGeldigeLanden());
			}
		}
	}

	@Override
	public String toString() {
		return "Persoon{" +
				"naam='" + naam + '\'' +
				", rijbewijs=" + rijbewijs +
				", reisdocument=" + reisdocument +
				'}';
	}
}
