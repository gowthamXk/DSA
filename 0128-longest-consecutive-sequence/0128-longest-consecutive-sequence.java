class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int MaxLength = 1;
        int count = 1;

      
        while(j < nums.length){
        
           if(nums[i] == nums[j]){
            i++;
            j++;
            
           }
           else if(nums[j] == (nums[i] + 1)){
            count++;
            MaxLength = Math.max(MaxLength , count);
            i++;
            j++;
            
           }
           else{
            
            count = 1;
            i = j;
            j = j + 1;
           
           }

            
        }
        return MaxLength;
    }
}