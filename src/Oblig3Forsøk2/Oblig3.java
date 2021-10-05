package Oblig3Forsøk2;

import javax.swing.*;
import java.util.Arrays;

class UnikeTall {
    // Deklarasjon av array for lagring av tilfeldige heltall

    private int[] array;

    /* Konstruktør som mottar arrayets lengde som parameter og
      oppretter arrayet.  */
    public UnikeTall(int lengde) {
        this.array = new int[lengde];

        fyllArray();
    }


    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
      Tallet det letes etter skal mottas som parameter.
      Metoden skal returnere true hvis tallet finnes i arrayet.
      Hvis ikke skal metoden returnere false. */
    private boolean finnes(int tall) {
        boolean fant = true;

        for (int i : array) {
            if (tall != i) {
                fant = false;
            }
        }
        return fant;
    }

    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
      begge grenser inkludert. Metoden skal gjøre dette på en måte
      som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
      parametre og heller ikke returnere noen verdi.
      Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
    */
    private void fyllArray() {

        int i = 0;

        while(i < array.length){
            int random = (int)(Math.random()*(900)+100);

            if(!finnes(random)){
                array[i] = random;
                i++;
            }
        }

    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    private int minste() {
        int min = array[0];

        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    // Metode som finner og returnerer det største tallet i arrayet.

    private int største() {
        int største = array[0];

        for (int i : array) {
            if (største < i) {
                største = i;
            }
        }
        return største;
    }

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

        private double gjennomsnitt(){
            double gjen = 0;
            int teller = 0;
            int sum = 0;
            for(int i : array){
                sum += i;
                teller++;
            }
            gjen = (double)sum/teller;
            return gjen;

        }

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
    public void melding(){
        String ut = "";
        int teller = 0;
        for(int i = 0; i < array.length; i++){
            Arrays.sort(array);
            ut+= array[i] + " ";
            teller++;
            if(teller == 8){
                ut+= "\n";
                teller=0;
            }
        }

        ut+= "\nMinste tall er " + minste() + "\n";
        ut+= "Største taller er " + største() + "\n";
        ut+= "Gjennomsnittsverdien er " + String.format("%.2f",gjennomsnitt());

        JOptionPane.showMessageDialog(null, ut);
    }


}

public class Oblig3 {

    public static void main(String[] args) {

        UnikeTall tall = new UnikeTall(65);

        tall.melding();


    }
}
