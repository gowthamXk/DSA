class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder();
       int length = s.length();
       int incomplete = 0;
       
        if (s.length() % k != 0) {
            incomplete = s.length() % k;
            length = s.length() + (k - incomplete);
        }


       String[] words = new String[(length / k)];
        for(int i = 0 ; i < length ; i++){
            if(i < s.length()){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(fill);
            }
        }
        int i = 0;
        int m = 0;
        String temp = sb.toString();
        
        while(i < length){
            
            words[m] = temp.substring(i , i + k);
            m++;
            i = i + k;
        }
        return words;
    }
}