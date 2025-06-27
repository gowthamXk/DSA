class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> li = new ArrayList<>();
        HashSet<List<Integer>> allSubsets = new HashSet<>();
        Arrays.sort(candidates);
         List<List<Integer>> list = new ArrayList<>(func(candidates , 0 , li , allSubsets , target));
         return list;
        
    }
    public  HashSet<List<Integer>> func(int [] arr , int i ,List<Integer> li ,HashSet<List<Integer>> allSubsets , int target){
        
            if(target == 0){
                
                allSubsets.add(new ArrayList<>(li));

            return allSubsets;
            }
        
        if(target < 0 || i >= arr.length){
            return allSubsets;
        }
        if(arr[i] <= target){
            li.add(arr[i]);
            func(arr , i + 1 , li ,allSubsets , target - arr[i] );
            li.remove(li.size() - 1);
        }
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) i++;
        func(arr , i + 1 , li ,allSubsets , target);

        


        return allSubsets;
    }
}