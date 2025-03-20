class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            int res = 1;
            temp.add(1);
            for(int j = 0 ; j < i ; j++){
                res = res*(i - j);
                res = res/(j+1);
                temp.add(res);
            }
            result.add(temp);
            
        }
        return result;
    }
}