package oblig1Forsøk2;

class Sirkel {

    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter(double radius){
        double diameter = 2 * radius;

        return diameter;
    }


    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double omkrets(double radius){
        return 2*Math.PI *radius;
    }


    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double areal(double radius){
        return Math.PI * Math.pow(radius,2);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {

        double radius = 23.5;
        double areal = Sirkel.areal(radius);
        double omkrets = Sirkel.omkrets(radius);
        double diameter = Sirkel.diameter(radius);


        System.out.println("Arealen av sirkelen med radius " + radius + " er " + String.format("%.2f",areal));
        System.out.println("Omkrets av sirkelen med radius " + radius + " er " + String.format("%.2f",omkrets));
        System.out.println("Diameteren av sirkelen med radius " + radius + " er " + String.format("%.2f",diameter));

    }

}
