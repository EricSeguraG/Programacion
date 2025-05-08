package AEA4.invertir;

import java.io.*;
import java.util.Scanner;

public class invertirparaules {

    public static void main(String[] args) {
        String nomFitxerEntrada = "C:\\Users\\usuario\\Documents\\GitHub\\Programacion_0485\\Programacion\\AEA4\\invertir\\archivo.txt";
        String nomFitxerSortida = "C:\\Users\\usuario\\Documents\\GitHub\\Programacion_0485\\Programacion\\AEA4\\invertir\\archivo_invertido.txt";

        try {
            File fitxerEntrada = new File(nomFitxerEntrada);
            Scanner lector = new Scanner(fitxerEntrada);

            File fitxerSortida = new File(nomFitxerSortida);
            if (fitxerSortida.exists()) {
                System.out.println("El fitxer " + nomFitxerSortida + " ja existeix, s'està sobreescrivint.");
            }

            PrintStream escriptor = new PrintStream(fitxerSortida);

            while (lector.hasNextLine()) {
                String linia = lector.nextLine();
                String liniaInvertida = new StringBuilder(linia).reverse().toString();
                escriptor.println(liniaInvertida);
            }

            lector.close();
            escriptor.close();

            System.out.println("Fitxer processat correctament i escrit a " + nomFitxerSortida);

        } catch (FileNotFoundException e) {
            System.out.println("L'arxiu " + nomFitxerEntrada + " no s'ha trobat.");
        } catch (IOException e) {
            System.out.println("S'ha produït un error durant la lectura o escriptura del fitxer.");
            e.printStackTrace();
        }
    }
}
