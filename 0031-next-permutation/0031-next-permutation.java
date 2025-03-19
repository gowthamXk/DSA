class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1 ;
        int n = nums.length;

        for(int i = n - 2 ; i >= 0 ; i-- ){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
       
        if(index == -1){
             Arrays.sort(nums);
        }
        else{

        

        for(int i = n - 1 ; i >= 0 ;i--){
            if(nums[i] > nums[index]){
                
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
            
        }
        
        int right = n - 1;
        int left = index + 1;
        while(left < right){
            int tem = nums[left];
            nums[left] = nums[right];
            nums[right] = tem;
            right--;
            left++;
        }
        }
      

    }
}