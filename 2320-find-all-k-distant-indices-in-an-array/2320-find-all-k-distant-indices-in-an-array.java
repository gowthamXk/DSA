class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> keyIndex = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == key){
            keyIndex.add(i);
            }
        }
        for(int j = 0 ; j < nums.length ; j++){
            for(int ke = 0 ; ke < keyIndex.size() ; ke++){
                if(Math.abs(j - keyIndex.get(ke)) <= k){
                    li.add(j);
                    break;
                }
            }
        }
        return li;
    }
}