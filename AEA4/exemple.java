package AEA4;
import java.io.*;

public class exemple {
    public static void main(String[] args) {
        exemple programa = new exemple();
        programa.inici();
    }

    public void inici() {
        File temp = new File("C:/Temp");
        File fotos = new File("C:/Temp/Fotos");
        File document = new File("C:/Temp/Document.txt");
        System.out.println(temp.getAbsolutePath() + " existeix? " + temp.exists());
        mostrarEstat(fotos);
        mostrarEstat(document);
    }

    public void mostrarEstat(File f) {
        System.out.println(f.getAbsolutePath() + " és un fitxer? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " és una carpeta? " + f.isDirectory());
    }
}