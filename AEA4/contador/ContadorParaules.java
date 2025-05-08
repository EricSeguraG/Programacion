package AEA4.contador;
import java.io.*;
import java.util.Scanner;

public class ContadorParaules {

    public static void main(String[] args) {
        String nomFitxerEntrada = "C:\\Users\\usuario\\Documents\\GitHub\\Programacion_0485\\Programacion\\AEA4\\contador\\entrada.txt";
        String nomFitxerSortida = "C:\\Users\\usuario\\Documents\\GitHub\\Programacion_0485\\Programacion\\AEA4\\contador\\sortida.txt";
        int contadorParaules = 0;

        try {
            File f = new File(nomFitxerEntrada);  
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                sc.next();
                contadorParaules++;
            }
            sc.close();

            File sortida = new File(nomFitxerSortida);
            if (sortida.exists()) {
                System.out.println("El fitxer " + nomFitxerSortida + " ja existeix, s'està sobreescrivint.");
            }

            PrintStream ps = new PrintStream(sortida);
            ps.println("Nombre total de paraules: " + contadorParaules);
            ps.close();

            System.out.println("Resultat escrit correctament a " + nomFitxerSortida);

        } catch (FileNotFoundException e) {
            System.out.println("L'arxiu " + nomFitxerEntrada + " no s'ha trobat.");
        } catch (IOException e) {
            System.out.println("S'ha produït un error durant la lectura o escriptura del fitxer.");
            e.printStackTrace();
        }
    }
}

