class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;
        int[] result = new int[nums.length];

        for(int i = 0 ; i < result.length ; i++){
            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex += 2;
            }
            else{
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
}