class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 1 ; i <= numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            int res = 1;
            temp.add(1);
            for(int j = 1 ; j < i ; j++){
                res = res*(i - j);
                res = res/(j);
                temp.add(res);
            }
            result.add(temp);
            
        }
        return result;
    }
}