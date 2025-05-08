package AEA4;
public class inicialitzar {
    public static void main(String[] args) {
      int[] arrayParells = new int[20];
  
      try {
        for(int i = 0; i <= arrayParells.length; i++) {  
          arrayParells[i] = 2 * i;
          System.out.println("Posició " + i + ": " + arrayParells[i]);
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("S'ha intentat accedir a una posició fora dels límits de l'array.");
      }
  
      System.out.println("Programa finalitzat correctament.");
    }
  }
  