package oblig1;

import static javax.swing.JOptionPane.showInputDialog;

public class Oblig1Oppgave2 {


    public static void main(String[] args) {
        // les inn navn, antall og pris for vare 1
        String vareNavnEn = showInputDialog("Navn på vare?");
        String antallVarerEn = showInputDialog("Antall varer?");
        String prisPrVareEn = showInputDialog("Pris på vare");

        // les inn navn, antall og pris for vare 2
        String vareNavnTo = showInputDialog("Navn på vare nr 2?");
        String antallVarerTo = showInputDialog("Antall varer av type vare nr 2?");
        String prisPrVareTo = showInputDialog("Pris på vare nr 2");

        int antallEn, antallTo;
        double prisVareEn, prisVareTo;

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        try {
            antallEn = Integer.parseInt(antallVarerEn);
            antallTo = Integer.parseInt(antallVarerTo);
            prisVareEn = Double.parseDouble(prisPrVareEn);
            prisVareTo = Double.parseDouble(prisPrVareTo);

        } catch (Exception e) {
            antallEn = 0;
            antallTo = 0;
            prisVareEn = 0;
            prisVareTo = 0;
        }

        // opprett to vare-objekter med de innleste verdiene
        Vare vareEn = new Vare(vareNavnEn, antallEn, prisVareEn);
        Vare vareTo = new Vare(vareNavnTo, antallTo, prisVareTo);

        vareEn.setNavn(vareNavnEn);
        vareEn.getNavn();
        vareEn.setPris(prisVareEn);
        vareEn.getPris();
        vareEn.setAntall(antallEn);
        vareEn.getAntall();
        vareTo.setNavn(vareNavnTo);
        vareTo.getNavn();
        vareTo.setPris(prisVareTo);
        vareTo.getPris();
        vareTo.setAntall(antallTo);
        vareTo.getAntall();

        // beregn og skriv ut total pris for alle varer i System.out
        double totalPris = vareEn.totalPris() + vareTo.totalPris();

        System.out.println("Totalprisen ble : " + totalPris);
        vareEn.printOut();
        vareTo.printOut();


    }

}
