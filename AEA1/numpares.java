public class numpares {
    public static void main(String[] args) {
        
        int longitud = 100;
        int[] pares = new int[longitud];
        for (int i = 0; i < longitud; i++) {
        pares[i] = i * 2; 
        }

    
        System.out.println("Los 100 primeros numeros pares son: ");
        for (int num : pares){
            System.out.print(num + " ");
        }
    }
}