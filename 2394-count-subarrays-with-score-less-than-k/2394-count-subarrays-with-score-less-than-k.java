class Solution {
    public long countSubarrays(int[] nums, long k) {
        long subArray = 0;
        long result = 0;
        int left = 0;
        int right = 0;

        while(right < nums.length){
            result =  (result + nums[right]);
            long limit = result * (right - left + 1);
          
             while(limit >=k && left <= right){
               limit = limit / (right - left + 1);
               result = result - nums[left];
               left++;
               limit = result * (right - left + 1);
                
             }
               if(limit < k){
            subArray += (right - left + 1);
            }
             right++;
        }
        return subArray;
    }
}