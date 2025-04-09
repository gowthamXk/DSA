class Solution {
    public int minOperations(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       int operation = 0;
       for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < k){
                return -1 ;
            }
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                if(nums[i] > k){
                    operation++;
                }
            }
       } 
       return operation;
        
    }
}