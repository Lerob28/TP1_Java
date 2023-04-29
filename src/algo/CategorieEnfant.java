package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategorieEnfant {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.printf("Entrer un age : ");
        int age = clavier.nextInt();

        Integer[] poussin = {6,7};
        Integer[] pupille = {8,9};
        Integer[] minime = {10,11};

        List<Integer> poussinList = new ArrayList();
        List<Integer> pupilleList = new ArrayList();
        List<Integer> minimeList = new ArrayList();

        poussinList.addAll(List.of(poussin));
        pupilleList.addAll(List.of(pupille));
        minimeList.addAll(List.of(minime));


        String categorie = age < 6
                ? "dans une categorie inconnue"
                : poussinList.contains(age)
                ? "Poussin"
                : pupilleList.contains(age)
                ? "Pupille"
                :  minimeList.contains(age)
                ? "Minime"
                : "Cadet";

        System.out.printf("Vous avez %s ans, donc vous etes %s !", age,categorie);
        clavier.close();
    }
}
