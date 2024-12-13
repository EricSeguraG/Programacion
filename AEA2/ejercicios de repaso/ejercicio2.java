import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.print("Introduce el numero de columnas de la matriz: ");
        int user = lector.nextInt();
        int [][] matriz = new int[5][user];

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz [i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }
        



    }
}