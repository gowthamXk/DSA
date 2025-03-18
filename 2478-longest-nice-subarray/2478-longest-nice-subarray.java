class Solution {
    public int longestNiceSubarray(int[] nums) {
        int right = 0 ;
        int left = 0;
        int operation = 0;
        

        int maxLength = 0;

        while(right < nums.length ){
            while((operation & nums[right])!=0){
                operation^=nums[left];
                left++;
            } 
              operation |=nums[right];
            
                if(right - left + 1 > maxLength){
                    maxLength = right - left + 1;
                }
            
            right++; 

        }
    return maxLength;
    }
}