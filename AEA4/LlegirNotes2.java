package AEA4;

import java.io.File;
import java.util.Scanner;

public class LlegirNotes2 {
    public static final String MARCA_FI = "fi";

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\usuario\\Documents\\GitHub\\Programacion_0485\\Programacion\\AEA4\\Notes2.txt");

            // Comprovar si el fitxer existeix
            if (!f.exists()) {
                System.out.println("El fitxer no existeix.");
                return;
            }

            Scanner lector = new Scanner(f);
            boolean llegir = true;

            while (llegir) {
                String nom = lector.next();

                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                } else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    double mitjana = llegirNotes(lector);
                    System.out.println(" − Mitjana: " + mitjana);
                }
            }

            lector.close(); // Tancar el fitxer

        } catch (Exception e) {
            System.out.println("1 Error llegint estudiants: " + e);
        }
    }

    /**
     * Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public static double llegirNotes(Scanner lector) {
        double res = 0;
        try {
            int numNotes = lector.nextInt();

            if (numNotes <= 0) {
                System.out.print(" (cap nota)");
                return 0;
            }

            for (int i = 0; i < numNotes; i++) {
                res += lector.nextDouble();
            }

            res = res / numNotes;

        } catch (Exception e) {
            System.out.println("2 Error llegint notes: " + e);
        }

        return res;
    }
}
