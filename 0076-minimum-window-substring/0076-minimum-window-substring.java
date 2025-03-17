class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        for(int i = 0 ; i < t.length() ; i++){
            hash[t.charAt(i)]++;
        }
        int right = 0;
        int left = 0;
        int count =0;
        int start = -1;
        int minlength = 1000000;

        while(right < s.length()){

            if(hash[s.charAt(right)] > 0){
                count++;
            }
            hash[s.charAt(right)]--;
            while(count == t.length()){

                if((right - left + 1) < minlength){
                    minlength = right - left + 1;
                    start = left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0){
                    count--;
                }
                left++;
            }
            right++;
        }
        return start == -1 ? "" : s.substring(start , start + minlength);
    }
}