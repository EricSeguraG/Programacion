package AEA3;

import java.util.Scanner;

public class arreglodoble {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("introduce filas: ");
        int filas = lector.nextInt();
        System.out.print("introduce columnas:");
        int columnas = lector.nextInt();

        char  figuras[][] = new char [filas][columnas];
        for (int i = 0; i<figuras.length;i++){
            for (int j=0; j<figuras[i].length;j++){
             if ((i%2==0)&&(j%2==0)){
                figuras[i][j]='a';
             }
             else if ((i%2==0)&&(j%2!=0)){
                figuras[i][j]='z';
             }
             else if ((i%2!=0)&&(j%2==0)){
                figuras[i][j]='2';
             }
             else
                figuras[i][j]='-';
            
            System.out.print(figuras[i][j]);
             }

                
               System.out.println();
            }
            
        }    
           
     }
            
  
    


