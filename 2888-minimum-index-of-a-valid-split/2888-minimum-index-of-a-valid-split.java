class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int dom = 0;
        int domfreq = 0;
        int maxfreq = 0;
        int split = 0;
        boolean check = true;
        for(int i = 0 ;i < nums.size() ; i++){
            hm.put(nums.get(i) , hm.getOrDefault(nums.get(i) , 0) + 1);
            if(hm.get(nums.get(i)) > maxfreq){
                maxfreq = hm.get(nums.get(i));
                dom = nums.get(i);
            
            }
        }
        if(nums.size() < 2){
            return -1;
        }
        
        for(int i = 0 ; i < nums.size() ; i++){
            if(nums.get(i) == dom){
                domfreq++;
            }
              
            if(!check && domfreq * 2 > nums.size() - split - 1){
                return split;
            }
            if(domfreq * 2 > (i + 1) && check ){
               
                split = i;
                check = false;
                domfreq = 0;
                 
                
            }
            
        
            
        }
        
        
        return -1;
    }
}