package AEA3;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
    Scanner tamaño = new Scanner(System.in);
    System.out.print("Introduce el tamaño del vector:");
    int []vector = new int[tamaño.nextInt()];
    for (int i=0;i<vector.length;i++){        
        System.out.print("ingrese el elemento "+(i+1)+": ");
        vector[i]=tamaño.nextInt();
    }
    
    boolean esta = false;
    System.out.print("ingresa un numero a buscar: ");
    Scanner lector = new Scanner(System.in);
    int numero = lector.nextInt();
    System.out.println();
    for(int i=0;i<vector.length;i++){
        if (vector[i]==numero){
            esta=true;
            System.out.println("el numero "+numero+" esta en la posicion "+(i+1));
        }
        
    }
    if (!esta){
        System.out.println("el numero no esta en el vector");
    }
    
}
}