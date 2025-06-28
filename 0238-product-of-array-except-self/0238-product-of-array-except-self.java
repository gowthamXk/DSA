class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] answer = new int[arr.length];
        int ans = 0;
        boolean Hasvalue = true;
        int zeroCount = 0;
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];
        // Arrays.fill(prefix,1);
        // Arrays.fill(suffix,1);

        // for(int i = 1 ; i < nums.length ; i++ ){
        //     prefix[i] = prefix[i-1]*nums[i-1];
        // }

        // for(int i = nums.length - 2 ; i >=0 ; i-- ){
        //     suffix[i] = suffix[i+1]*nums[i+1];
        // }
        
        // for(int i = 0 ; i < nums.length ; i++ ){
        //    answer[i] = prefix[i]*suffix[i];
        // }
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