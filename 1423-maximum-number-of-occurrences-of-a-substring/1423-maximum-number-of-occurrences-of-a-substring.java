class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
       HashMap<Character , Integer > cMap = new HashMap<>();
       HashMap<String , Integer > sMap = new HashMap<>();

       int right = 0;
       int left = 0;
       int maximum = 0;

       while(right < s.length()){
          cMap.put(s.charAt(right) , cMap.getOrDefault(s.charAt(right),0)+1);
          if(cMap.size() > maxLetters || right - left + 1 > minSize ){
            cMap.put(s.charAt(left),cMap.get(s.charAt(left))-1);
            if(cMap.get(s.charAt(left))==0){
                cMap.remove(s.charAt(left));
            }
            left++;
          }

          if(cMap.size() <= maxLetters && (right - left + 1) == minSize){
            sMap.put(s.substring(left , right+1) , sMap.getOrDefault(s.substring(left , right+1),0)+1);
            
           
          if(sMap.get(s.substring(left , right+1)) > maximum){
            maximum = sMap.get(s.substring(left , right+1));
            
          }
          }
          right++;
       }
       return maximum;
    }
}