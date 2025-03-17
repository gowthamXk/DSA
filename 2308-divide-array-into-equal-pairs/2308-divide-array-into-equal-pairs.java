class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int right = 1;
        int left = 0;
        

        while(right < nums.length){
            if(nums[right] != nums[left]){
             
                if((right - left)% 2 != 0){
                    return false;
                }
                else{
                    left = right ; 
                }
            }
            
                right++;
           
        }
        if((right - left)%2==0)
            return true;
        else
            return false;

    }
}