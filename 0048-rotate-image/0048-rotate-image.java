class Solution {
    public void rotate(int[][] matrix) {
        int k = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            
            for(int j = i ; j < matrix.length ; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
                
            }
            int left = 0;
            int right = matrix.length - 1;

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp ;
                left++;
                right--;

            }
        }
        

       

    }
}