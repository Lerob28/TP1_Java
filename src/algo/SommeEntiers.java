package algo;

import java.util.Scanner;

public class SommeEntiers {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nbreCoup = 0;
        int nbreMystere = 0;
        int resultat = 0;
        boolean stop = false;

        System.out.printf("Entrer un Nombre : ");
        nbreMystere = clavier.nextInt();

        do {
            nbreCoup += 1;
            resultat += nbreCoup;
            System.out.println(resultat);
            stop = (nbreCoup == nbreMystere) ? true : false;
            System.out.println(nbreCoup);
            System.out.println(nbreMystere);
            System.out.println(stop);
        }while (!stop);


        System.out.printf("La somme des %s premiers nombres donne %s : ",nbreMystere,resultat);
        clavier.close();
    }
}
