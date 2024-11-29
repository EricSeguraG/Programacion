public class fcparells {
    public static void main(String[] args) {
       
        int [][] fcparells = new int[10][10];

        for(int i = 0; i < fcparells.length; i++) {
            for(int j = 0; j < fcparells[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    fcparells[i][j] = -1;
                else
                    fcparells[i][j] = i;
                System.out.print(fcparells[i][j]+ " ");
            }
            System.out.println();
            

        }

        
        
    }


}
