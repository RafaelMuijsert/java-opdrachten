package Week1;

public class Huis {
    String straat;
    int huisnummer;
    String plaats;
    public Huis() {}
    public Huis(String straat, int huisnummer) {
        this.straat = straat;
        this.huisnummer = huisnummer;
    }
    public Huis(String straat, int huisnummer, String plaats) {
        this(straat, huisnummer);
        this.plaats = plaats;
    }
    public String getAdres() {
        return this.straat + " " + String.valueOf(this.huisnummer) + " " + this.plaats;
    }

    @Override
    public String toString() {
        return getAdres();
    }
}
