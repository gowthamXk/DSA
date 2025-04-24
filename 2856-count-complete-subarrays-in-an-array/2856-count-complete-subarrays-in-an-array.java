class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        int totalDistinct = set.size();

        int right = 0 ;
        int left = 0;
        int count = 0;
        HashMap<Integer , Integer > hm = new HashMap<>();
        while(right < nums.length){
            hm.put(nums[right] , hm.getOrDefault(nums[right] , 0 ) + 1);

            while(hm.size() == totalDistinct){
                count = count + (nums.length - right);

                hm.put(nums[left] , hm.get(nums[left]) - 1);
                if(hm.get(nums[left]) == 0){
                    hm.remove(nums[left]);
                }
                left++;

            }
            right++;
        }

    return count;
    }
}