class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
       return cut(a , b) || cut(b , a);
    }
    public boolean cut(String a , String b){
        int i = 0;
        int j = b.length() - 1;

        while(i <= j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }

        if(i>= j) return true;

        return check(a ,i , j) || check( b , i , j);

    }
        public boolean check(String a ,int start , int end){
            int i = start;
            int j = end;

            while(i <= j){
                if(a.charAt(i) != a.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

    
}