class Solution {
    public int minimumOperations(int[] nums) {
       HashMap<Integer , Integer > hm = new HashMap<>();
       int operation = 0 ;
       int idx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
       for(int i = 0 ; i  < nums.length ; i++){
            

            while(hm.containsKey(nums[i]) && hm.get(nums[i]) > 1){
                int count = 3;
                while(idx < nums.length && count > 0){
                    hm.put(nums[idx], hm.get(nums[idx]) - 1);

                    count--;
                    idx++;
                    
                }
                operation++;
            }
       }
       return operation;
    }
    
        
      
    
}
