public class nota10 {  
    public static void main(String[] args) {
        double[] nota10 = {5,4,3,2,10};
        boolean hay10 = false;

        for (int i = 0; i < nota10.length; i++){
            if (nota10[i]==10){
                hay10 = true;
                break;
            }
         }
        if (hay10){
            System.out.print("alguien ha sacado un 10");

        }
        else{
             System.out.print("nadie ha sacado un 10");
        }

    
            
        }

    

    }

    

