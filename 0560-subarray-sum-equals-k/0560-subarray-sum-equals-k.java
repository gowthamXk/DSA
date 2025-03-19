class Solution {
    public int subarraySum(int[] nums, int k) {
     
      int right = 0;
      int subArray = 0;
      int sum = 0;
      HashMap<Integer,Integer > hm = new HashMap<>();
      hm.put(0,1);

        while(right < nums.length){

            sum = sum + nums[right];
            int rem = sum - k;
            if(hm.containsKey(rem)){
                subArray += hm.get(rem);
            }

            hm.put(sum , hm.getOrDefault(sum , 0)+1);
            right++;
        }
        return subArray;
    }
}