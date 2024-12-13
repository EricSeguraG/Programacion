import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.print("Introduce el numero de filas y columnas de las matrices: ");
        int user = lector.nextInt();
        int [][] matriz1 = new int[user][user];
        int [][] matriz2 = new int[user][user];
        int [][] sumatriz = new int [user][user];
        for (int i=0;i<sumatriz.length;i++){
            for( int j=0; j<sumatriz[i].length; j++){
                matriz1 [i][j] = (int)(Math.random() * 10);
                matriz2 [i][j] = (int)(Math.random() * 10);
                sumatriz[i][j] = matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("La primera matriz es: ");
        for (int i=0; i<matriz1.length;i++){
            for (int j=0; j<matriz1[i].length;j++){
                System.out.print(matriz1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("La segunda matriz es: ");
        for (int i=0; i<matriz2.length;i++){
            for (int j=0; j<matriz2[i].length;j++){
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("La suma de las matrices es: ");
        for (int i=0; i<sumatriz.length;i++){
            for (int j=0; j<sumatriz[i].length;j++){
                System.out.print(sumatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}