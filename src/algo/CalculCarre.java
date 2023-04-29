package algo;

import java.util.Scanner;

public class CalculCarre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.printf("Entrer un nombre : ");
        int a = clavier.nextInt();

        int carree = (int) Math.pow(a,2);

        System.out.printf("le carre de %s est %s ", a, carree);
        clavier.close();
    }
}
