import java.util.Scanner;

public class areatriangulo{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("ingrese el primer valor");
 		double base= lector.nextDouble();
 		System.out.print("ingrese el segundo valor");
 		double altura= lector.nextDouble();
 		double total= base*altura/2;
 		 System.out.println("el resutaldo es" + total);
 		 
	}
}
