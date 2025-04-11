class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low ; i <= high ; i++ ){
            if(Integer.toString(i).length() % 2 != 0){
                continue;
            }
            String full = Integer.toString(i);
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0 ; j < full.length()/2 ; j++ ){
                sum1 = sum1 + Integer.parseInt(String.valueOf(full.charAt(j)));
                sum2 = sum2 + Integer.parseInt(String.valueOf(full.charAt(full.length()/2 + j)));
            }
            // for(int k = full.length()/2 ; k < full.length() ; k++){
            //      sum2 = sum2 + Integer.parseInt(String.valueOf(full.charAt(k)));
            // }

            if(sum1 == sum2){
                count++;
            }

        }
        return count;
    }
}