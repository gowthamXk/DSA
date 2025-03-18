class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       
        return (sub(nums , k ) - sub(nums , k -1));
    }
    public int sub(int[]nums , int k){
        int right = 0;
        int left = 0;
        HashMap<Integer , Integer > hm = new HashMap<>();
         int count = 0;

        while(right < nums.length){
                if(k <= 0){
                    return 0;
                }
                hm.put(nums[right] , hm.getOrDefault(nums[right] , 0) + 1);
               
                while(hm.size() > k){
                    hm.put(nums[left] , hm.get(nums[left]) -1);
                    if(hm.get(nums[left])==0){
                        hm.remove(nums[left]);
                    }
                left++;
                }
                if(hm.size() <= k){
                    count = count + (right - left) + 1;
                }
                right++;
                
        }
        return count;
    }
}