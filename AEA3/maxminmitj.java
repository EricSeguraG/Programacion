package AEA3;

import AEA3.UTILIDADES.lectordatosterminal;
import AEA3.UTILIDADES.MaxMinMed;

public class maxminmitj {
    public static void main(String[] args) {
    MaxMinMed datos = new MaxMinMed();
    lectordatosterminal datos2 = new lectordatosterminal();
    System.out.println("Introduce 5 numeros sobre los que trabajar:");
    double[] nums = new double[5];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = datos2.leerdouble();
    }

    double max = datos.calcularMaxim(nums);
    System.out.println("La nota màxima és " + max + ".");
    double min = datos.calcularMinim(nums);
    System.out.println("La nota mínima és " + min + ".");
    double mitjana = datos.calcularMitjana(nums);
    System.out.println("La mitjana de les notes és " + mitjana + ".");

    
}

}
