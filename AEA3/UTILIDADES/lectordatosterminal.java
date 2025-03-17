package UTILIDADES;
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
  public int leerInt(){
    boolean nollegit = true;
    while(nollegit){
      if (lector.hasNextInt()){
        nollegit = false;
        return lector.nextInt();
      }
      else
      System.out.println("Introduce un numero valido");
      lector.next();
    }
    return 0;
}   
public char leerLetra(){
  boolean Letranoleida = true;
  while(Letranoleida){
    //if (lector.next().charAt(0)){
      Letranoleida = false;
      return lector.next().charAt(0);
    //}
    //else {
      //System.out.println("Introduce una letra:");
      //lector.next();
    //}

  }
  return 0;
}
  public String leerString() {
    Scanner lector = new Scanner(System.in); // Crear el objeto Scanner
    boolean StringNoLeido = true;
    String StringLeido = "";

    while (StringNoLeido) {
        StringLeido = lector.nextLine(); // Leer la cadena completa

        if (!StringLeido.isEmpty()) { // Verificar si la cadena no está vacía
            StringNoLeido = false;
        } else {
            System.out.println("Error: la cadena está vacía, por favor intenta de nuevo.");
        }
    }

    return StringLeido; // Retornar la cadena leída
}
  
}