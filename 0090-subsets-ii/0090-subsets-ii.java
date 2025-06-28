class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        sub(nums , 0 , new ArrayList<>() , answer);
        return answer;
    }
    public  void sub(int[] nums , int index , List<Integer> li , List<List<Integer>> answer){
        
            answer.add(new ArrayList<>(li));
            
        

        for(int i = index ; i <  nums.length ; i++){
            if( i > index && nums[i] == nums[i - 1])continue;
            li.add(nums[i]);
            sub(nums , i + 1 , li , answer);
            li.remove(li.size() - 1);
        }
        
    }
}