package Week4.Interface;

public class Paspoort extends Reisdocument {

	public Paspoort(String naam, String BSN) {
		super(naam, BSN);
	}
	@Override
	public String getDocumentType() {
		return "Paspoort";
	}

	@Override
	String getGeldigeLanden() {
		return "De hele wereld";
	}
}
