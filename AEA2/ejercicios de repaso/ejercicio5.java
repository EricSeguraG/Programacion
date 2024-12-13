import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce numeros del 0 al 10:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor;
                System.out.print("Valor en posición [" + i + "][" + j + "]: ");
                    valor = scanner.nextInt();
                if (valor < 0 || valor > 10) {
                    System.out.println("introduce un número entre 0 y 10.");
                }
                else {
                    matriz[i][j] = valor;
                }
            }  
        }
        
        int[] contar = new int[11];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                contar[matriz[i][j]]++;
            }
        }

        
        System.out.println("total de números del 0 al 10 en la matriz:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número " + i + ": " + contar[i] + " vez/veces");
        }

    }
 }
