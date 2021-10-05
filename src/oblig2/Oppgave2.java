package oblig2;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

class Tallspill {
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        int slumpTall = (int) (Math.random() * 201);
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return slumpTall;
    }

    public void visMelding(String melding) {
        // Viser parameterens innhold i en meldingsboks.
        JOptionPane.showMessageDialog(null, melding);

    }

    private void forLite(int tall) {
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */

        String ut = tall + " Er for lite! Prøv igjen";

        visMelding(ut);


    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */

        String ut = tall + " Er for stor! Prøv igjen";
        visMelding(ut);

    }


    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */


        String ut = gjetning + " Er riktig! Du gjettet riktig på " + antall + " forsøk";
        visMelding(ut);

    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int tall = nyttTall();


        int teller = 0;
        String input = " ";
        int numberUt;

        while (true) {

            input = showInputDialog("Jeg tenker på et tall mellom 0 og " +
                    " 200" + "\n" + " Prøv å gjette");

            try {
                numberUt = Integer.parseInt(input);
            } catch (Exception e) {
                numberUt = 0;
            }

            if (numberUt < tall) {
                forLite(numberUt);

                teller++;
            } else if (numberUt > tall) {
                forStort(numberUt);

                teller++;
            } else {
                avsluttRunde(teller, numberUt);
                break;
            }


        }

    }
}

public class Oppgave2 {

    public static void main(String[] args) {

        Tallspill nyttSpill = new Tallspill();

        nyttSpill.kjørSpill();

    }
}



