import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca 5 numeros: ");
        double arraymedia [] = new double [5];
        double total = 0;
        for (int i=0; i<arraymedia.length; i++){
            arraymedia [i] = scanner.nextInt();
            total = total + arraymedia[i];            
            
        }
        System.out.print("La media de los numeros es: " +(total/5));
    
    }
}