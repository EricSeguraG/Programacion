package AEA4.Excepcio;

public class excepcio02 {
    public static void main(String[] args) {
        String t[] = {"Hola", "Adeu", "Fins Dema"};
        try {
            System.out.println("Abans d'executar el for");
            for (int i = 0; i < t.length; i++) {
                System.out.println("Posició " + i + ": " + t[i]);
            }
            System.out.println("Després d'executar el for");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Programador borracho");
        }

        System.out.println("El programa ha acabat");
    }
}
