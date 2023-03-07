package ExtraOpdrachten.Arrays;

public class Boekenkast {
    Boek[] boeken;


    public Boekenkast(int grootte) {
        this.boeken = new Boek[grootte];
    }
    void voegBoekToe(String titel, String auteur, int isbn) {
        // Kijk door elk boek in de boekenkast
        for(int i = 0; i < boeken.length; i++) {
            // Als er op de positie nog geen boek staat
            if(boeken[i] == null) {
                // Maak een nieuw boek aan
                boeken[i] = new Boek(titel, auteur, isbn);
                // Plekje gevonden en boek toegevoegd, dus nu zijn we klaar.
                return;
            }
        }
        // Alle plekken doorgekeken, maar niks zit leeg dus de boekenkast is vol.
        System.out.println("De boekenkast zit vol");
    }

    void printBoeken() {
        // Voor elk boek in de boekenkast
        for(Boek boek: this.boeken) {
            // Print het broek
            System.out.println(boek);
        }
    }
}
