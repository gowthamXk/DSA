class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        return new ArrayList<>(comb3 (1 , n , k , new ArrayList<>() ,allSubsets ));
    }
    public List<List<Integer>> comb3 (int i , int n , int k , List<Integer> li , List<List<Integer>> set){
        if(i > 9){
            if(n == 0 && li.size() == k){
                set.add(new ArrayList<>(li));
            }
        
        return set;
    }

    if(i <= n){
        li.add(i);
        comb3(i + 1 , n - i , k , li , set);
        li.remove(li.size() - 1);
    }
    comb3(i + 1 , n , k , li , set);

    return set;

}
}