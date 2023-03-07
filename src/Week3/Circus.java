package Week3;

public class Circus {
    private String naam;
    private Artiest[] artiesten;

    public Circus() {
        this.artiesten = new Artiest[]{
                new Artiest("Henk"),
                new Artiest("Piet"),
                new Artiest("Joop")
        };
    }
    public void printArtiesten() {
        for(int i = 0; i < artiesten.length; i++) {
            System.out.println("Week3.Artiest " + i + " " + this.artiesten[i]);
        }

    }
    public boolean setArtiest(int index, Artiest artiest) {
        if(index < 0 || index > this.artiesten.length) {
            return false;
        }
        this.artiesten[index] = artiest;
        return true;
    }
    public int getAantalArtiesten() {
        return this.artiesten.length;
    }

}
