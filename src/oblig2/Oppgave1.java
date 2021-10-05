package oblig2;

import javax.swing.*;

public class Oppgave1 {

    public static void main(String[] args) {

        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn nedre grense"));
        int øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvregrense"));

        while (nedreGrense >= øvreGrense) {
            if (nedreGrense >= øvreGrense) {
                JOptionPane.showMessageDialog(null, "Error, prøv igjen");
                nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn nedre grense"));
                øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvregrense"));
            }
        }

        int sum = 0;
        for (int i = nedreGrense; i <= øvreGrense; i++) {
            sum += i;
            System.out.print(i);
            if (i < øvreGrense) {
                System.out.print(" + ");
            }

            if (i == øvreGrense) {
                System.out.print(" = ");
            }

            if(i == 10){
                System.out.println();
            }

        }
        System.out.println(sum);
    }
}
