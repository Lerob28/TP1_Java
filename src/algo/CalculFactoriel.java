package algo;

import java.util.Scanner;

public class CalculFactoriel {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.printf("Entrer un nombre : ");
        int a = clavier.nextInt();

        int factoriel = findFactorial(a);

        System.out.printf("le carre de %s est %s ", a,factoriel);
        clavier.close();
    }

    private static int findFactorial(int num)
    {
        if(num==0)
            return 1;
        else if(num==1)
            return 1;
        else
            return num*findFactorial(num-1);
    }
}
