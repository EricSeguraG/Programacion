public class vector {
    public static void main(String[] args) {
      int [] vector = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
      int Length = vector.length;
      int max = vector[0];
      int min = vector[0];
      for (int i = 0; i < Length; i++) {
        if (vector[i] > max) {
          max = vector[i];
        }
        if (vector[i] < min) {
          min = vector[i];
        }
      }
      System.out.println("el numero mas alto es: " +max);
      System.out.println("el numero mas bajo es: " +min);

    }
}
