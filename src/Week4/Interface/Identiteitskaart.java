package Week4.Interface;

public class Identiteitskaart extends Reisdocument {

	public Identiteitskaart(String naam, String BSN) {
		super(naam, BSN);
	}
	@Override
	public String getDocumentType() {
		return "Identiteitskaart";
	}
	@Override
	public String getGeldigeLanden() {
		return "Europa";
	}
}
