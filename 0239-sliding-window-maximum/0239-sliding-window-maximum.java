class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        int secMax = Integer.MIN_VALUE;
        int secIdx = 0;

        int right = 0;
        int left = 0;

        while(right < nums.length){
            if(nums[right] >= max){
                max = nums[right];
                maxIdx = right;
            }
            if((right - left + 1) % k == 0){
                li.add(max);
               
                    
                    System.out.println();
                if(nums[left] == max && left == maxIdx){
               
                    for(int i = left + 1 ; i <= right ; i++){
                        
                        if(nums[i] <= max && nums[i] >= secMax){
                            secMax = nums[i];
                            secIdx = i;
                            
                        }
                        
                    }
                    
                    max = secMax;
                    maxIdx = secIdx;
                    secMax = Integer.MIN_VALUE;
                
                }
                left++;
            }
                right++;
        }
        int[] ans = new int[li.size()];
        for(int i = 0 ; i < li.size() ; i++){
            ans[i] =  li.get(i);
        }
        return ans;

    }
}