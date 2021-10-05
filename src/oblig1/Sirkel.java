package oblig1;

public class Sirkel {


    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double beregnDiameter(double radius){
        double diamter = radius *2;
        return diamter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double beregnOmkrets(double radius){
        double omkrets = (radius * 2) * Math.PI;
        return omkrets;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double beregnAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

}

