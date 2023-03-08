package Week3;

public class Artiest {
    private String naam;


    public Artiest(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }
    @Override
    public String toString() {
        return this.naam;
    }
}
