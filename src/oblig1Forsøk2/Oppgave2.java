package oblig1Forsøk2;

import static javax.swing.JOptionPane.showInputDialog;

class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if(antall > 0) {
            this.antall = antall;
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if(pris > 0) {
            this.pris = pris;
        }
    }

    public double beregnPris() {
         return pris * antall;
    }
}

public class Oppgave2 {
    public static void main(String[] args) {


        String innVareNavn = showInputDialog("Navn på vare");
        String innantall = showInputDialog("Antall");
        String innpris = showInputDialog("Pris:");

        String innvare2 = showInputDialog("Vare 2");
        String innantall2 = showInputDialog("Antall");
        String innpris2 = showInputDialog("Pris:");

        int antall1,antall2;
        double pris1,pris2;

        try{
            antall1 = Integer.parseInt(innantall);
            antall2 = Integer.parseInt(innantall2);
            pris1 = Double.parseDouble(innpris);
            pris2 = Double.parseDouble(innpris2);
        }catch (Exception e){
            antall1 = 0;
            antall2 = 0;
            pris1 = 0;
            pris2 = 0;
        }

        Vare vare1 = new Vare(innVareNavn, antall1,pris1);
        Vare vare2 = new Vare(innvare2, antall2,pris2);

        double sum = vare1.beregnPris() + vare2.beregnPris();
        System.out.println("Totalprisen ble: " + sum);







    }
}
