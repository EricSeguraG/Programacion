package AEA3.UTILIDADES;
import java.util.Scanner;
import java.util.Random;

public class lectordatosterminal {
  private Scanner lector = new Scanner(System.in);
  public double leerdouble(){
    Random aleatorio = new Random();
        
    boolean noleido = true;
    String[] insultos = {"cerdo agridulce","basura humana","la recalcada concha puta de tu madre","subnormal","idiota","mongolico", "gilipollas", "retractil", "retrasado mental"};
    int numeroAleatorio = aleatorio.nextInt(insultos.length);
    while(noleido){
      if (lector.hasNextDouble()){
        noleido = false;
        return lector.nextDouble();
      }
      else{
        numeroAleatorio = aleatorio.nextInt(insultos.length);
        System.out.println("Introduce un numero " + insultos[numeroAleatorio]);
        lector.next();
      }
    }
    return 0;
  }
}    