class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] answer = new int[arr.length];
        int ans = 0;
        boolean Hasvalue = true;
        int zeroCount = 0;
        
        boolean zero = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0 ){
                
                if(Hasvalue){
                    ans = 1;
                    Hasvalue = false;
                }
                ans = ans * arr[i];
            }
            else{
                zero = true;
                zeroCount++;

            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            if(zeroCount > 1){
                answer[j] = 0;
            }
            else if(zero && arr[j] != 0){
                answer[j] = 0;
            }
            else if(zero && arr[j] == 0){
                answer[j] = ans;
            }
            
            else{
                answer[j] = (ans/arr[j]);
            }
        }
return answer;
        
    }
}