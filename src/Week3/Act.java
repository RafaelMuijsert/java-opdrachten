package Week3;
import java.util.ArrayList;

public class Act {
	private String naam;
	private int tijdsduur;
	private ArrayList<Artiest> artiesten;

	public Act(String naam, int tijdsduur) {
		this.naam = naam;
		this.tijdsduur = tijdsduur;
		this.artiesten = new ArrayList<Artiest>();
	}

	public int getTijdsduur() {
		return tijdsduur;
	}

	public void voegArtiestToe(Artiest artiest) {
		this.artiesten.add(artiest);
	}

	public void printAct() {
		System.out.println(this.artiesten);
	}

	public int getAantalArtiesten() {
		return this.artiesten.size();
	}

	public boolean wordtUitgevoerdDoor(Artiest artiest) {
		if(this.artiesten.contains(artiest)) {
			return true;
		}
		for(Artiest art: this.artiesten) {
			if(artiest.getNaam().equals(art.getNaam())) {
				return true;
			}
		}
		return false;
	}

}
