package AEA3;

public class aea3test {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        //calcularMaxim(a,b);// num2 més gran --> a = num1 i b = num2
        int max1 = calcularMaxim(a, b);
        int c = 45;
        int d = 34;
        //calcularMaxim(c, d); //num1 més gran --> c =num 1 i d = num2
        int max2 = calcularMaxim(c, d);
        System.out.println(max1 + " " + max2);
    }

    public static int calcularMaxim(int num1, int num2){
        if (num1 <= num2){
            return num2;
        }
        else{
            return num1;
        }
        
    }
    /*public static void calcularMaxim(int num1, int num2){
        if (num1 <= num2){
            System.out.println("num 2 més gran");
        }
        else{
            System.out.println("num 1 més gran");
        }
    }*/
}
