package RECURSIVIDAD;

public class Palabras{

    public static void main(String[] args) {
        String letras = "hola";
        String resultado = invertir(letras);
        System.out.println("La palabra " +letras+ " invertida es: " + resultado);
    }

    public static String invertir(String letras) {
        if (letras.length() <= 1) {
            return letras;
        }
        return letras.charAt(letras.length() - 1) + invertir(letras.substring(0, letras.length() - 1));
    }

    
}

