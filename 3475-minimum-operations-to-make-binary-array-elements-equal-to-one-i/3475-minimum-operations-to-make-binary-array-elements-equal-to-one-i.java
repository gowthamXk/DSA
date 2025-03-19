class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
       for(int i = 0 ; i < nums.length ; i++){
        if(nums[i]==0){
            for(int j = i ; j < i + 3 ; j++){
                if(j >= nums.length){
                    return -1;
                }
                if(nums[j] == 0){
                    nums[j] = 1;
                }
                else{
                    nums[j] = 0;
                }
            }
            count++;
        }
       }

    return count;
    }
}