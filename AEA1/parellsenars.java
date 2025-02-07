public class parellsenars {
        public static void main(String[] args) {
           
            int [][] parellsenars = new int[10][10];
    
            for(int i = 0; i < parellsenars.length; i++) {
                for(int j = 0; j < parellsenars[i].length; j++) {
                        parellsenars[i][j] = 1;
                    if (i % 2 ==0 && j % 2 !=0)
                        parellsenars[i][j] = 2;
                    if (i % 2 !=0 && j %2 ==0)
                        parellsenars[i][j] = 3;
                    if (i % 2 !=0 && j % 2 !=0)
                        parellsenars[i][j] = 4;
                    System.out.print(parellsenars[i][j]+ " ");
                }
                System.out.println();
                
    
            }
    
            
            
        }

}
