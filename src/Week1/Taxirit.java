package Week1;

public class Taxirit {
    double prijsPerKm = 1.25;
    int aantalPersonen;
    int maxAantal;
    double afstand;
    public Taxirit(double afstand) {
        this.afstand = afstand;
        this.maxAantal = 10;
        this.aantalPersonen = 4;
    }
    public Taxirit(double afstand, int aantalPersonen, int maxAantal) {
        this.afstand = afstand;
        this.aantalPersonen = aantalPersonen;
        this.maxAantal = maxAantal;
    }

    public boolean taxiIsVol() {
        return this.aantalPersonen >= this.maxAantal;
    }

    public void voegPersoonToe() {
       if(taxiIsVol()) {
           System.out.println("Taxi is vol");
           return;
       }
       this.aantalPersonen++;
    }

    public void voegPersoonToe(int aantal) {
        if(this.aantalPersonen + aantal > this.maxAantal) {
            System.out.println("Er is niet genoeg ruimte");
            return;
        }
    }

    public double berekenPrijsPerPersoon() {
        float tarief = 1.0f;
        if(taxiIsVol()) {
            tarief -= 0.1;
        }
        return tarief;

    }
}
