class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int right = 1;
        int left = 0;
        System.out.print(Arrays.toString(nums));

        while(right < nums.length){
            if(nums[right] != nums[left]){
                // System.out.println("left" + " " + left + " " + "right" + " " + right);
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