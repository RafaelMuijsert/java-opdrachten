
package Week6.Voorstelling;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Scherm extends JFrame {

    private Voorstelling voorstelling;
    private JLabel jlAantalPlaatsen;
    private JLabel jlAantalVerkocht;
    private JLabel jlStatus;

    private JTextField jtAantalVerkopen;
    private JTextField jtAantalAnnuleren;

    public Scherm(Voorstelling voorstelling) {
        this.voorstelling = voorstelling;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Voorstelling " + voorstelling.getNaam());
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("aantal plaatsen vrij:"));
        String aantalPlaatsen = String.valueOf(voorstelling.getAantalPlaatsen());
        jlAantalPlaatsen = new JLabel(aantalPlaatsen);
        add(jlAantalPlaatsen);

        add(new JLabel("aantal verkocht:"));
        String aantalVerkocht = String.valueOf(voorstelling.getAantalVerkocht());
        jlAantalVerkocht = new JLabel(aantalVerkocht);
        add(jlAantalVerkocht);

        jtAantalVerkopen = new JTextField();
        add(jtAantalVerkopen);

        JButton jbVerkoopKaartje = new JButton("Verkoop kaartjes");
        jbVerkoopKaartje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    voorstelling.verkoopKaartjes(Integer.parseInt(jtAantalVerkopen.getText()));
                    jlAantalVerkocht.setText(String.valueOf(voorstelling.getAantalVerkocht()));
                    jlAantalPlaatsen.setText(String.valueOf(voorstelling.getAantalPlaatsen()));
                    jlStatus.setText("Kaartje(s) verkocht");
                    if(voorstelling.uitverkocht()) {
                        jlAantalPlaatsen.setText("UITVERKOCHT");
                    }
                } catch(Exception exception) {
                    jlStatus.setText("Voer een geldig getal in");
                }
            }
        });

        add(jbVerkoopKaartje);
        jtAantalAnnuleren = new JTextField();
        add(jtAantalAnnuleren);

        JButton jbAnnuleerKaartje = new JButton("Annuleer kaartjes");
        jbAnnuleerKaartje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    voorstelling.annuleerKaartjes(Integer.parseInt(jtAantalAnnuleren.getText()));
                    jlAantalVerkocht.setText(String.valueOf(voorstelling.getAantalVerkocht()));
                    jlAantalPlaatsen.setText(String.valueOf(voorstelling.getAantalPlaatsen()));
                    jlStatus.setText("Kaartje(s) geannuleerd");
                } catch (Exception exception) {
                    jlStatus.setText("Voer een geldig getal in");
                }
            }
        });

        add(jbAnnuleerKaartje);

        jlStatus = new JLabel("");

        add(jlStatus);

        setVisible(true);
    }
}
