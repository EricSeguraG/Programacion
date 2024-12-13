public class ejercicio1 {
    public static void main(String[] args) {
        int [][] arrayrandom = new int[5][5];
        int suma= 0;
        
        System.out.print("- El promedio de la matriz es: ");
        for (int i=0; i<arrayrandom.length; i++){
            for (int j=0; j<arrayrandom[i].length; j++){
                arrayrandom [i][j] = (int)(Math.random() * 100);
                suma = suma + arrayrandom[i][j];   
            }
        }
        int media = suma / 25;
        System.out.println(media);


        int mayor = arrayrandom[0][0];
        int repetido = 0;
        for (int i=0; i<arrayrandom.length; i++){
            for (int j=0; j<arrayrandom[i].length; j++){
                if (arrayrandom[i][j] > mayor) {
                    mayor = arrayrandom[i][j];
                    repetido = 0;
                }
                else if (mayor == arrayrandom[i][j]){
                    repetido++;
                }
            }
        }

        System.out.print("- El numero mas alto es: " + mayor);
        if (repetido != 0){
            System.out.println(" y se ha repetido: " +repetido+ " vez/veces");
        }
        else 
            System.out.println(" y no se ha repetido ninguna vez");
       

        System.out.print("- Los numeros primos son: ");
        for (int i=0; i<arrayrandom.length; i++){
            for (int j=0; j<arrayrandom[i].length; j++){
                boolean prime = true;
                for(int k = 2; k < Math.sqrt(arrayrandom[i][j]); k++){
                    if (arrayrandom[i][j] != 0)
                        if (arrayrandom[i][j] % k == 0) {
                            prime = false;
                            break;
                        }
                }
                if (prime)
                    System.out.print(arrayrandom[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("- Los numeros pares son: ");
        for (int i=0; i<arrayrandom.length; i++){
            for (int j=0; j<arrayrandom[i].length; j++){
                if (arrayrandom[i][j] % 2 == 0){
                    System.out.print(arrayrandom[i][j] + " ");
                }
            }
        }
        System.out.println();
        int diagonales = 0;
        for (int i=0; i<arrayrandom.length; i++){
            for (int j=0; j<arrayrandom[i].length; j++){
                if ((i==j) || (i ==arrayrandom[i].length-1 -i)){
                   diagonales = diagonales+arrayrandom[i][j];
                }
            }
        }   
        System.out.println("- La suma de todas las diagonales es: "+diagonales);
        
        int ultfila = 0;
        for (int i=0; i<arrayrandom[arrayrandom.length -1].length; i++){
            ultfila = ultfila+arrayrandom[arrayrandom.length -1][i];
        }
        System.out.print("- La suma de los numeros de la ultima fila es: "+ultfila);
    }
}


