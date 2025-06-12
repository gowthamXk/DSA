class Solution {
    public int numberOfSteps(int num) {
        
        return step(num  , 0);

    }
    static int step(int num , int n){
        if(num == 0){
            return n;
        }
         if(num%2 == 0){
            
            return step(num/2 , n + 1);
        }
        else{
           
            return step(num - 1 , n + 1);
        }
    }
}