package algo;

import java.util.Scanner;

public class TrouveNombre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nbreCoup = 0;
        int nbreMystere = 0;
        boolean stop = false;

        System.out.printf("Entrer un Nombre : ");

        do {
            nbreMystere = clavier.nextInt();
            nbreCoup += 1;
            stop = (nbreMystere < 10 || nbreMystere > 20) ? false : true;
           if(nbreMystere < 10) {
               System.out.printf("Saisir un nombre plus grand: ");
           }
           if(nbreMystere > 20){
               System.out.printf("Saisir un nombre plus petit: ");
           }
        }while (!stop);


        System.out.printf("Felicitation, vous avez saisi le nombre %s en %s coup", nbreMystere,nbreCoup);
        clavier.close();
    }
}
