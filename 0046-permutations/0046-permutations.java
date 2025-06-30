class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permutation(nums , 0 ,  new ArrayList<>());
    }
    public List<List<Integer>> permutation(int[] nums , int index , List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> li = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                li.add(nums[i]);
            }
            ans.add(new ArrayList<>(li));
            return ans;
        }

        for(int i = index ; i < nums.length ; i++){
            swap(nums , i , index);
            permutation(nums , index + 1 , ans);
            swap(nums , i , index);
        }
        return ans;
    }
    public void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}