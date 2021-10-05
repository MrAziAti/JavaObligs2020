package oblig4;

class SjekkArray {

    public static int summer(int tall1, int tall2, int[] liste) {
        int sum = 0;
        if (tall1 > 0 && tall2 < liste.length) {
            for (int i = tall1; i <= tall2; i++) {
                sum += liste[i];
            }
        }
        return sum;
    }

    public static boolean arrayLike(int[] liste1, int[] liste2) {
        boolean like = true;

        if (liste1.length != liste2.length) {
            like = false;

        }
        for (int i = 0; i < liste1.length; i++) {
            if (liste1[i] != liste2[i]) {
                like = false;
            }
        }
        return like;
    }

    public static boolean finnesFraFør(int[] liste, int tall) {
        boolean finnes = false;

        for (int i = 0; i < liste.length; i++) {
            if (liste[i] != tall) {
                finnes = true;
            }
        }
        return finnes;
    }
}

public class Oppgave2 {

    public static void main(String[] args) {

        int[] liste = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 25};
        int[] liste2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(SjekkArray.summer(6, 5, liste));
        System.out.println(SjekkArray.arrayLike(liste2, liste));
        System.out.println(SjekkArray.finnesFraFør(liste, 25));

    }
}
