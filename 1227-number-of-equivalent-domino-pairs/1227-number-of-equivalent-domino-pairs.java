class Solution {
    public int numEquivDominoPairs(int[][] d) {
        HashMap<String , Integer > hm = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < d.length ; i++){
          int a = Math.max(d[i][0] , d[i][1]);
          int b = Math.min(d[i][0] , d[i][1]);

          String temp = a + " " + b;
          hm.put(temp , hm.getOrDefault(temp , 0)+1);
          if(hm.containsKey(temp) && hm.get(temp) > 1){
            count = count + hm.get(temp) - 1;
          }

        }
        
        return count;
    }
}