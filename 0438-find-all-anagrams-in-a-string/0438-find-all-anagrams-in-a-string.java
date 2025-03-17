class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        HashMap<Character , Integer > sCount = new HashMap<>();
        HashMap<Character , Integer > pCount = new HashMap<>();

        for(int i = 0 ; i < p.length() ; i++){
            pCount.put(p.charAt(i) , pCount.getOrDefault(p.charAt(i),0)+1);
        }
        int left = 0 ;
        int right = 0 ;
        int count = 0;

        while(right < s.length()){
             sCount.put(s.charAt(right) , sCount.getOrDefault(s.charAt(right),0)+1);
              if(right - left + 1 > p.length()){
                    sCount.put(s.charAt(left) , sCount.get(s.charAt(left))-1);
                    if(sCount.get(s.charAt(left)) == 0){
                        sCount.remove(s.charAt(left));
                    }
                    left++;
                }
             if(right - left + 1 == p.length()){
                if (sCount.equals(pCount)) {
                    li.add(left);
                }
             }
               
                right++;
        }
        return li;


    }
}