package oblig2Forsøk2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String[] args) {


        int sum = 0;
        int nedregrense = Integer.parseInt(showInputDialog("nedre grense"));
        int øvregrense = Integer.parseInt(showInputDialog("øvre grense"));
        while(nedregrense >= øvregrense){
            if(nedregrense >= øvregrense){
                showMessageDialog(null, "nedregrense må være større enn øvregrens");
                nedregrense = Integer.parseInt(showInputDialog("nedre grense"));
                øvregrense = Integer.parseInt(showInputDialog("øvre grense"));
            }
        }
        for(int i = nedregrense; i<=øvregrense; i++){
            sum +=i;
            System.out.print(i);
            if(i < øvregrense){
                System.out.print("+");
            }
            if(i == øvregrense){
                System.out.print("=");
            }
            if(i % 10 == 0){
                System.out.print("\n");
            }

        }
        System.out.print(sum);
    }
}
