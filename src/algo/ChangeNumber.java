package algo;

import java.util.Scanner;
public class ChangeNumber {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.printf("Entrer un nombre : ");
        int a = clavier.nextInt();
        System.out.printf("Entrer un second nombre : ");
        int b= clavier.nextInt();

        int c = 0;
        c = a;
        a = b;
        b= c;

        System.out.printf("Vous avez Entre : %s et %s", a, b);
        clavier.close();
    }
}
