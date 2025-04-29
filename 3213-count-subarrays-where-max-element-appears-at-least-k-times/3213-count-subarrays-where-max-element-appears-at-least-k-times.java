class Solution {
    public long countSubarrays(int[] nums, int k) {
        long subarray = 0;
        int max = 0;
        // HashMap<Integer , Integer > hm = new HashMap<>();
        
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        int right = 0 ;
        int left = 0;

        while(right < nums.length){
            if(nums[right] == max){
                count++;
            }
            while(count >= k){
                subarray += nums.length - right;
                if(nums[left] == max){
                    count--;
                }
                left++;
            }
            right++;
        }
        return subarray;
    }
}