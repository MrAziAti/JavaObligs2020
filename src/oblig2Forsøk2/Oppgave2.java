package oblig2Forsøk2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Tallspill {
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        int slumptall = (int) (Math.random() * 201);

        return slumptall;
    }

    public void visMelding(String melding) {
        // Viser parameterens innhold i en meldingsboks.
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */

        String ut = tall + " er for lite! Prøv igjen";
        visMelding(ut);
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        String ut = tall + " er for stort! Prøv igjen";
        visMelding(ut);
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        String ut = gjetning + " er riktig \nDu gjettet riktig på " + antall + " forsøk";
        visMelding(ut);
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */

        int slum = nyttTall();
        String input = showInputDialog("Jeg tenker på et tall mellom 0 og 200 \nPrøv å gjette på tallet: ");

        int innTall = 0;
        int gjetning = 0;
        while (innTall != slum) {
            try {
                innTall = Integer.parseInt(input);
            } catch (Exception e) {
                showMessageDialog(null, "Det du tastet var ikke et tall, prøv igjen");
            }

            if (innTall < slum) {
                forLite(innTall);
                input = showInputDialog("Jeg tenker på et tall mellom 0 og 200 \nPrøv å gjette på tallet: ");

            } else if (innTall > slum) {
                forStort(innTall);
                input = showInputDialog("Jeg tenker på et tall mellom 0 og 200 \nPrøv å gjette på tallet: ");;
            }else{
                avsluttRunde(gjetning, innTall);

            }

            gjetning++;


        }
    }
}

public class Oppgave2 {

    public static void main(String[] args) {

        Tallspill newTallSpill = new Tallspill();

        newTallSpill.kjørSpill();
    }
}
