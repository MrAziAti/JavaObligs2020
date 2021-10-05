package oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;


    }
    // get / set metoder
    // antall og pris må være større enn null

    public void setNavn(String navn) {

        this.navn = navn;
    }

    public String getNavn() {

        return navn;
    }

    public void setAntall(int antall) {

        this.antall = antall;

    }

    public int getAntall() {
        if(antall < 0) {
            this.antall = 0;
        }
        return antall;
    }

    public void setPris(double pris) {

        this.pris = pris;
    }

    public double getPris() {
        if(pris < 0) {
            this.pris = 0;
        }
        return pris;
    }

    // metode for å beregne totalpris (pris * antall)

    public double totalPris() {
        pris = antall * pris;
        return pris;
    }

    public void printOut() {
        System.out.println("Navn på vare: " + navn + "\n" + "Antall: " + antall + "\n" + "Totalpris: " + pris);
    }

}
