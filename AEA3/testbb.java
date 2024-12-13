package AEA3;

public class testbb {
    public static void main(String[] args) { 
        int a = 5;
        int b= 10;
        int c= 15;
        calcularmaximo(a, b, c);
        calcularminimo(a,b,c);
        int minimo = calcularminimo(a,b,c);
        System.out.print("el numero minimo es: "+minimo);
    }
    
    public static void calcularmaximo(int num1, int num2, int num3){
        if (num1>num2 && num1>num3)
            System.out.println("el numero mayor es : "+num1);
        else if (num2>num1 && num2>num3)
           System.out.println("el numero mayor es: "+num2);
        else
            System.out.println("el numero mayor es: " +num3);

    }
    public static int calcularminimo(int num1, int num2, int num3){
        if (num1 <= num2 && num1<=num3){
            return num1;
        }
        else if (num2<=num1 && num2<=num3){
            return num2;
        }
        else
            return num3;
            


    }
}
