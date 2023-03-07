package Week4.Overerving.Een;

public class Student extends Persoon {
	private int studentnr;
	public Student(String naam, int lengte, int studentnr) {
		// Roep de constructor van de overerfde klasse aan
		super(naam, lengte);
		this.setStudentnr(studentnr);
	}


	public int getStudentnr() {
		return this.studentnr;
	}
	public void setStudentnr(int studentnr) {
		this.studentnr = studentnr;
	}

	@Override
	public String toString() {
		return String.format("%s en heeft het studentnummer %d", super.toString(), getStudentnr());
	}
}
