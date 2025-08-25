class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m * n];

        int i = 0; 
        int j = 0;
        int ptr = 0;
        int itr = 0;
        
    while(i + j <= m + n - 1){
            int row = i;
            int col = j;

        if(itr % 2 == 0){
            
                while(row >= 0 && col < n){
                   
                    res[ptr] = mat[row][col];

                    if( i == m - 1 && j == n - 1){
                        return res;
                    }
                    ptr++;
                    row--;
                    col++;
                    
                    
                }
                i = row + 1;
                j = col;
            }
        else{
            while(row < m && col >= 0){
               
                res[ptr] = mat[row][col];
                if( i == m - 1 && j == n - 1){
                        return res;
                    }
                ptr++;
                row++;
                col--;
            }
            i = row;
            j = col + 1;
        }
        
        if(j == n){
            j = j - 1;
            i++;
        }
        if( i == m){
            i = i - 1;
            j++;
        }
        

        
         
        
            itr++;
    }
        return res;
    }
}