class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer > hm = new HashMap<>();
        int max = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> m : hm.entrySet()){
            if(m.getValue() > max){
                max = m.getValue();
            }
        }
        for(Map.Entry<Integer , Integer> m : hm.entrySet()){
            if(m.getValue() == max){
                count++;
            }
        }
        return count * max;
    }
}