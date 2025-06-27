class Solution {
    public List<List<Integer>> combine(int n, int k) {
        HashSet<List<Integer>> set = combo( 1 , n , k , new HashSet<List<Integer>>() , new ArrayList<>());
        
        return new ArrayList<>(set);
    }
    public HashSet<List<Integer>> combo(int i , int n , int k , HashSet<List<Integer>> sets , List<Integer> li ){
        if( i > n ){
            if(li.size() == k){
                sets.add(new ArrayList<Integer>(li));
            }
            return sets;
        }
        if(li.size() > k){
            return sets;
        }
        li.add(i);
        combo( i + 1 , n , k , sets , li);

        li.remove(li.size() - 1);
        combo( i + 1 , n , k , sets , li);

        return sets;

    }
}