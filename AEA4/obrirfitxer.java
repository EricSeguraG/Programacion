package AEA4;
import java.io.*;
import java.util.Scanner;

public class obrirfitxer {
    public static void main(String[] args) {
        obrirfitxer programa = new obrirfitxer();
        programa.inici();
    }

    public void inici() {
        try{
        File f = new File("Document.txt");
        Scanner scanner = new Scanner(f);
        System.out.println("Fitxer obert correctament.");
    }
    catch(Exception e){
        System.out.println("Error: " + e);
    }
}
}