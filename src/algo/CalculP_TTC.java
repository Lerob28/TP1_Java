package algo;

import java.util.Scanner;

public class CalculP_TTC {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.printf("Entrer le prix HT : ");
        double prix_HT = clavier.nextDouble();
        System.out.printf("Entrer le nombre D'articles : ");
        int nbreArticle= clavier.nextInt();
        System.out.print("Entrer la TVA ( % ) : ");
        final double TVA = clavier.nextDouble();

        double prix_TTC = (prix_HT * nbreArticle);
        prix_TTC = prix_TTC + (prix_TTC * TVA);

        System.out.println("------------------------------------------------------------");
        System.out.println("| prix HT (XAF)   | Quantite   |  TVA (%)  | prix TTC (XAF) |");
        System.out.println("------------------------------------------------------------");
        System.out.printf("|  %.2f         |  %s         | %.2f      | %.2f        |", prix_HT,nbreArticle,TVA,prix_TTC);
        System.out.println();
        System.out.println("------------------------------------------------------------");
    }
}
