class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1 ; i < n ; i++){
            res = buildnext(res);
        }
        return res;
    }
    public String buildnext(String res){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1 ; i < res.length() ; i++){
            if(res.charAt(i) == res.charAt(i - 1)){
                count++;
            }
            else{
                result.append(count).append(res.charAt(i - 1));
                count = 1;
            }

        }
         result.append(count).append(res.charAt(res.length() - 1));
        return result.toString();
    }
}