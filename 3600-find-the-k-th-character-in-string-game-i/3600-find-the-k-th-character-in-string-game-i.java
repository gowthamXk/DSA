class Solution {
    public char kthCharacter(int k) {
        return check( k , new StringBuilder("a"));
    }
    public char check(int k , StringBuilder sb){
        
        if(sb.length() >= k){
            return sb.charAt(k - 1);
        }
        StringBuilder sbb = new StringBuilder();
        for(int i = 0 ; i < sb.length() ; i++){
            sbb.append((char)(sb.charAt(i) + 1));
        }
        
        return check(k , sb.append(sbb));
    }
}