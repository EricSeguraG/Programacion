package AEA3;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        int tamano = scanner.nextInt();

        int[] vector1 = new int[tamano];
        int[] vector2 = new int[tamano];
        int[] resultado = new int[tamano];
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector:") ;
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }
        System.out.println("El resultado de la suma de los dos vectores es:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]+" ");
        }

} 
}         
 
       

        

    
