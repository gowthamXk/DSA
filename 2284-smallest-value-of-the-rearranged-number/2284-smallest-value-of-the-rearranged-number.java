class Solution {
    public long smallestNumber(long num) {
        ArrayList<Integer> digit = new ArrayList<>();
        long temp = num;
        long ans = 0;
        while(temp != 0){
            digit.add((int)(temp%10));
            temp = temp/10;
        }
        Collections.sort(digit);
        
       
        if(num > 0){
        for(int i = 0 ; i < digit.size() ; i++){
            if(digit.get(i) == 0){
                continue;
            }
            else{
                long tem = digit.get(0);
                digit.set(0,digit.get(i));
                digit.set(i , (int)tem);
                return sum(digit , 0 , digit.size());
                
            }
        }
        }else{
           return -(sum(digit , 0 , digit.size()));
        }
        
        return -1;
    }
    public long sum(List<Integer> li , int start , int end){
        long ans = 0;
        for(int i = start ; i < end ; i++){
            if(li.get(i) < 0){
                li.set(i , -1 * li.get(i));
            }
            ans = (ans * 10) + li.get(i);
        }
        return ans;
    }
}