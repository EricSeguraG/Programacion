package RECURSIVIDAD;

public class Contardigitos {

    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        int numero = 12345;
        int resultado = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + resultado + " dígitos.");
    }
}
