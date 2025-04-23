class Solution {
    public int countLargestGroup(int n) {
        int group = 0;
        int max = 0;
        HashMap<Integer , Integer > hm =new HashMap<>();

        for(int i = 1 ; i <= n ; i++){

            int digit = SumDigit(i);
            
            
            hm.put( digit, hm.getOrDefault( digit , 0) + 1);
            max = Math.max(max , hm.get(digit));

            
        }
        
        for (Integer value : hm.values()) {
            if(value.equals(max)){
                group++;
            }
}
    return group;
 
    }
    public int SumDigit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}