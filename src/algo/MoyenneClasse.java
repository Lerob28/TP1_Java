package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoyenneClasse {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String note;
        boolean stop = false;
        double average = 0;
        double total = 0;
        List<Double> notes = new ArrayList<Double>();

        afficherMessage();

        average = getAverage(clavier, stop, average, total, notes);

        System.out.printf("Moyenne de la classe : %.2f \n", average);
        System.out.println("Liste des notes Superieur a la moyenne: ");

        for(double noteEleve: notes) {
            if(noteEleve > average)
                System.out.printf("%.2f \n",noteEleve);
        }
        clavier.close();
    }

    private static double getAverage(Scanner clavier, boolean stop, double average, double total, List<Double> notes) {
        String note;
        do {
           note = clavier.nextLine();
           if (note.equals("+")) {
              stop = true;
           }else {
               notes.add(Double.parseDouble(note));
               total += Double.parseDouble(note);
               average = total / notes.size();
           }
       } while (!stop);
        return average;
    }
    private static void afficherMessage() {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" | Entrer les Notes des Eleves  \n");
        System.out.println(" | une fois termine, appuer  sur  \" + \"  pour afficher le resultat. ");
        System.out.println("-------------------------------------------------------------");
    }
}
