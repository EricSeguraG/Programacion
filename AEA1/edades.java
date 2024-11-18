public class edades {
    public static void main(String[] args) {

    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    int length = ages.length;
    int min = ages[0];
    int max = ages[0];
    for (int i = 0; i<length; i++){
        if (ages[i] < min){
            min = ages[i];
        }
        if (ages [i]>max){
            max = ages [i];
        }
    }
    System.out.println("la edad minima es: "+min+ " y la maxima es: "+max);
    System.out.println("la diferencia entre los dos numeros es: "+(max-min));


    float avg, sum = 0;
    
    for (int age : ages) {
      sum += age;
    }
    
    avg = sum / length;

    System.out.println("The average age is: " + avg);
    
}
}
