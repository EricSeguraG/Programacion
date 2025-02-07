package AEA3;
import java.util.Scanner;
public class estrellitas{
    public static void main(String[] args) {

    public void inici(){
        programa(7);
        programa(1);
        programa(5,6);
        programa(3);
        programa(5);
        programa(3,2);
        }


    public void programa(int num, int cant){
        for (int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}