package oblig4;

import java.util.Random;

public class Oppgave1 {

    public static void main(String[] args) {

        int[]liste = {2,4,6,12,78,45,3,42,5,-7};

        int sum =0;
        for(int i = 0; i < liste.length; i++){
            sum = sum + liste[i];
        }
        System.out.println("Summen av array med for løkke:" + sum);

        System.out.println();
        int sum2 = 0;
        for(int i:liste){
            sum2 += i;
        }
        System.out.println("Sum med en for each løkke " +sum2);

        Random generator = new Random();
        int x = generator.nextInt(6) + 10;
    }
}
