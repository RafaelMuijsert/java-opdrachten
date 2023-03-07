package Week1;

public class Hemellichaam {
    private String naam;
    private String type = "onbekend";
    private int tempMin;
    private int tempMax;
    public Hemellichaam(String naam, String type) {
        this(naam);
        this.type = type;
    }

    public Hemellichaam(String naam) {
        this.naam = naam;
        this.tempMin = 0;
        this.tempMax = 0;
    }

    public String getNaam() {
        return this.naam;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
        System.out.println("Het type van " + getNaam() + " is veranderd naar " + getType());
    }

    public String toString() {
        return this.getNaam() + " (" + this.getType() + ")";
    }

    public void setTemperatuur(int tempMin, int tempMax) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public void setTemperatuur(int temp) {
        this.tempMin = temp;
        this.tempMax = temp;
    }

    public void printTemperatuur() {
        if(this.tempMin == this.tempMax) {
            System.out.println(String.format("Het is ongeveer %d graden", this.tempMin));
        } else {
            System.out.println(String.format("Het is minimaal %d graden, en maximaal %d graden", this.tempMin, this.tempMax));
        }
    }
}
