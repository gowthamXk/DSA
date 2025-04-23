class Solution {
    public int countLargestGroup(int n) {
        int group = 0;
        int max = 0;
        int[] arr = new int[40];

        for(int i = 1 ; i <= n ; i++){

            int digit = SumDigit(i);
            ++arr[digit];
            if(max < arr[digit]){
                max = arr[digit];
                group = 1;
            }
            else if(max == arr[digit] ){
                group++;
            }


            
        }
      
        
    return group;
    }
 
    
    public int SumDigit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}