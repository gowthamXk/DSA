class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subSets = new ArrayList<>();
        set( nums , 0 , new ArrayList<>() , subSets );
        return subSets;
    }
    public  List<List<Integer>> set(int [] arr , int i , List<Integer> li , List<List<Integer>>ans){

            if( i == arr.length){
                ans.add(new ArrayList<>(li));
                return ans;
            }
    
        li.add(arr[i]);
        set(arr , i + 1 , li , ans);

        li.remove(li.size() - 1);
        set(arr , i + 1 , li , ans);

        return ans;

    }     
}