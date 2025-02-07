package AEA3;

import java.util.Scanner;

public class CalculArees {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

        String figura = s.nextLine();
        double area = 0;
        boolean noexisteix = false; 

        if (figura.equals("triangle")){
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
        }

        else if (figura.equals("quadrat")){
            double r = 37.0;
            area = Math.pow(r, 2);
        }

        else if (figura.equals("rectangle")){
            double a = 68.0;
            double b = 39.0;
            area = a*b;
        }

        
        else if (figura.equals("trapezi")){
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            area = ((a*b)*h)/2;
        }

        //cas en que la figura = "rombe"
        else if (figura.equals("rombe")){
            //OPCIO 1:exists = true;
            //OPCIO 3: noexisteix = false;
            double dM = 75.0;
            double dm = 30.0;
            area = (dM*dm)/2;
        }

        //cas en que la figura = "paralelogram"
        else if (figura.equals("paralelogram")){
            //OPCIO 1:exists = true;
            //OPCIO 3: noexisteix = false;
            double b = 45.0;
            double h = 13.0;
            area = b*h;
        }

        //cas en que la figura = "cercle"
        else if (figura.equals("cercle")){
            //OPCIO 1:exists = true;
            //OPCIO 3: noexisteix = false;
            System.out.println("Quin es el radi del cercle?");
            double r = s.nextDouble();
            //funció matemàtica que eleva a 2 el radi
            //Math.PI = nombre pi (3.14159....)
            area = Math.pow(r, 2)*Math.PI; // area = r * r* 3.14;
        }
        else{ //OPCIO 2
            noexisteix = true;
        }

    /*if (!noexisteix){ //OPCIO 3
      System.out.println("L'area del " + figura + " es " + area);
    }
    else{
      System.out.println("else para cristian");
    }*/

        if (noexisteix){ //OPCIO 2
            System.out.println("No és cap figura de les que toquen");
        }
        else{ //OPCIO 2
            System.out.println("L'area del " + figura + " es " + area);
        }

    /*OPCIO 1: if(exists) {
      //fem el system out per imprimir a terminal
      System.out.println("L'area del " + figura + " es " + area);
    }*/


    }
}