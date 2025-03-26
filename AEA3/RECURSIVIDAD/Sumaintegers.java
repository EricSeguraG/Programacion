package RECURSIVIDAD;

public class Sumaintegers {

    public static int factorial(int sumar) {
        if (sumar == 0) {
            return 0; 
        }
        
        return sumar + factorial(sumar - 1);
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}
