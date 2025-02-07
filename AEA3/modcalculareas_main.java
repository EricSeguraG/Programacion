package AEA3;

import java.util.Scanner;

import AEA3.UTILIDADES.lectordatosterminal;
import AEA3.UTILIDADES.calculareas;

public class modcalculareas_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        calculareas areas = new calculareas();
        lectordatosterminal datos = new lectordatosterminal();

        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

        String figura = s.nextLine();
        double area = 0;    
        if (figura.equals("triangle")){
            System.out.println("introduce la altura:");
            double altura = datos.leerdouble();
            System.out.println("introduce la base:");
            double base = datos.leerdouble();
            area = areas.triangle(altura,base);
        }

        else if (figura.equals("quadrat")){
            System.out.println("Introduce el tamaño del cuadrado:");
            double ladito = datos.leerdouble();
            area = areas.quadrat(ladito);
        }

        else if (figura.equals("rectangle")){
            System.out.println("Introduce la altura del rectangle:");
            double altura = datos.leerdouble();
            System.out.println("Introduce la base del rectangle:");
            double base = datos.leerdouble();
            area = areas.rectangle(altura,base);
        }

        else if (figura.equals("trapezi")){
            System.out.println("Introduce la altura del trapezi:");
            double altura = datos.leerdouble();
            System.out.println("Introduce la base del trapezi:");
            double base = datos.leerdouble();
            System.out.println("Introduce la altura del trapezi:");
            double alturaTrap = datos.leerdouble();
            area = areas.trapezi(altura,base,alturaTrap);    
        }

        else if (figura.equals("rombe")){
            System.out.println("Introduce el diametre del rombe:");
            double diametre = datos.leerdouble();
            System.out.println("Introduce el mitj del rombe:");
            double mitj = datos.leerdouble();
            area = areas.rombe(diametre,mitj);
        }

        else if (figura.equals("paralelogram")){
            System.out.println("Introduce la base del paralelogram:");
            double base = datos.leerdouble();
            System.out.println("Introduce la altura del paralelogram:");    
            double altura = datos.leerdouble();
            area = areas.paralelogram(base,altura);
        }

        else if (figura.equals("cercle")){
            System.out.println("Introduce el radio del cercle:");
            double radio = datos.leerdouble();
            area = areas.cercle(radio);
        }
        if (area == 0){
            System.out.println("No és cap figura de les que toquen");
        }
        else{
            System.out.println("L'area del " + figura + " es " + area);
        }
    
}
}
