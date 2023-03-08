package Week3;

import java.util.ArrayList;

public class Circus {
    private String naam;
    private Artiest[] artiesten;
    private ArrayList<Act> acts;

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

    public void voegActToe(Act act) {
        this.acts.add(act);
    }


    public void printActOverzicht() {
        for(Act act: this.acts) {
            act.printAct();
        }
    }

    public Act getLangsteAct() {
        Act langsteAct = null;
        for(Act act: this.acts) {
            int tijdsduur = act.getTijdsduur();
            if(langsteAct == null || tijdsduur > langsteAct.getTijdsduur()) {
                langsteAct = act;
            }
        }
        return langsteAct;
    }

    public ArrayList<Act> zoekActsMetAantalArtiesten(int aantal) {
        ArrayList<Act> acts = new ArrayList<Act>();
        for(Act act: this.acts) {
            if(act.getAantalArtiesten() == aantal) {
                acts.add(act);
            }
        }
        return acts;
    }
}
