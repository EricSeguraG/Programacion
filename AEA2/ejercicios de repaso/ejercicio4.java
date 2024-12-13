import java.util.Scanner;
public class ejercicio4 {
    
    public static void main(String[]args) {
        int [] segpeq = new int [5];
        for(int i= 0; i<segpeq.length; i++){
            segpeq [i] = (int)(Math.random() * 100);
            System.out.print(segpeq[i] + " ");
        }
        int menor = segpeq[0];
        int segmenor = segpeq[1];
        for (int i=0; i<segpeq.length; i++){
            if (segpeq[i] <= menor){
                segmenor = menor;
                menor = segpeq[i];
            }else if (segpeq[i]<segmenor){
                segmenor = segpeq[i];
            }

        }
        System.out.println();
        System.out.print("El segundo numero mas pequeño es: "+segmenor);        
    }
}
            
            
        

    
