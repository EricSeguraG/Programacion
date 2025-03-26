package RECURSIVIDAD;

public class Potencia {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        System.out.println("La potencia de " +base+" elevado a "+exponente+" es: "+potencia(base, exponente));
    
    }
        public static int potencia (int base, int exponente) {
    
            if (exponente == 0) {
                return 1;
            }
            return base * potencia(base, exponente - 1);
        }
}



