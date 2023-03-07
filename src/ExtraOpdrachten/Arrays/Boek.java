package ExtraOpdrachten.Arrays;

public class Boek {
    private String titel;
    private String auteur;
    private int isbn;
    public Boek(String titel, String auteur, int isbn) {
        this.titel = titel;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return this.titel + " (" + auteur + ")";
    }
}
