package algo;

import java.util.Scanner;

public class AffichageSigneProduit {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.printf("Entrer un nombre : ");
        int a = clavier.nextInt();
        System.out.printf("Entrer un second nombre : ");
        int b= clavier.nextInt();

        boolean isNegative = (Integer.signum(a) == -1 && Integer.signum(b) != -1) || (Integer.signum(b) == -1 && Integer.signum(a) != -1);
        boolean isZero = (Integer.signum(a) == 0 || Integer.signum(b) == 0);
        String productType = isZero
                ? "Zero"
                : isNegative
                ? "Negatif"
                : "Positif";

        System.out.printf("le produit de %s et %s sera %s", a, b,productType);
        clavier.close();
    }
}
