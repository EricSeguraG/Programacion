package AEA3;
import java.util.Scanner;
public class estrellitasdemar {
    public static void main(String[] args) {
    estrellitasdemar programa = new estrellitasdemar();
    programa.est(7);
    programa.gui(1);
    programa.num(5,6);
    programa.est(3);
    programa.gui(5);
    programa.num(3,2);
 }


public void est(int cant){
    for (int i=0;i<cant;i++){
        System.out.print("*");
    }
    System.out.println();
}
public void gui(int cant){
    for (int i=0;i<cant;i++){
        System.out.print("-");
    }
    System.out.println();
}
public void num(int num, int cant){
    for (int i=0;i<cant;i++){
        System.out.print(num);
    }
    System.out.println();

}
    
}


