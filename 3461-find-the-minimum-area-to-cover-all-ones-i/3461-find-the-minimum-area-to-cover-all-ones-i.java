class Solution {
    public int minimumArea(int[][] grid) {
        int h = 0;
        int v = 0;
         int area = 0;
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         int min1 = Integer.MAX_VALUE;
         int max1 = Integer.MIN_VALUE;

        

        boolean vertical = false;
        
        for(int i = 0 ; i < grid.length ; i++){
            // boolean seen = false;
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    
                    min = Math.min(min , i + 1);
                    max = Math.max(max , i + 1);
                    System.out.println(min + " " + max);
                    v = max - min + 1; 
                    // vertical = true;
                    // seen = true;
                    
                }
                
                if(grid[i][j] == 1){

                    min1 = Math.min(min1 , j + 1);
                    max1 = Math.max(max1 , j + 1);
                    // System.out.println(min1 + " " + max1);
                    h = max1 - min1 + 1;  

                }  
                // System.out.println("v = " + v + " h = " + h);
                
                
               
                
            }
            area = h * v; 
            vertical = false;
            

            
        }
        return area;
    }
}