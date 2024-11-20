import java.util.Scanner;
public class cars {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] cars = new String[4];

    for (int i = 0; i < cars.length; i++){
    System.out.print("introduce la marca del coche "+(i+1)+ ": ");
    cars[i] = scanner.nextLine();
    }

    System.out.println("los coches que has introducido son: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);


    

        }
}
}
