public class vectores {
public static void main(String[] args) {
    String [] entrada = new String[6];
    Scanner sc = new Scanner(System.in);
    for (int i= 0; i<entrada.length; i++){
        System.out.println("ingrese un caracter");
        entrada[i]=sc.next();
    }
    for (int i= 0; i<entrada.length; i++){
        if (entrada[i].equals "a" || entrada[i]=="e" || entrada[i]=="i" || entrada[i]=="o" || entrada[i]=="u"){
            entrada[i]="$";
        }
        }
        System.out.println("posicio"+i+"== "+entrada[i]);


}

}
