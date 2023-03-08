package Week6.Voorstelling;
public class Voorstelling {

    private String naam;
    private int aantalPlaatsen;
    private int aantalVerkocht;

    public Voorstelling(String naam, int aantal) {
        this.naam = naam;
        this.aantalPlaatsen = aantal;
        this.aantalVerkocht = 0;
    }

    public void verkoopKaartjes(int aantal) {
        if (aantalPlaatsen - aantal >= 0) {
            aantalPlaatsen -= aantal;
            aantalVerkocht += aantal;
        }
    }

    public boolean uitverkocht() {
        return this.aantalPlaatsen <= 0;
    }
    public void annuleerKaartjes(int aantal) {
        if(aantalVerkocht - aantal < 0)
            return;

        aantalPlaatsen += aantal;
        aantalVerkocht -= aantal;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    public int getAantalVerkocht() {
        return aantalVerkocht;
    }

}
