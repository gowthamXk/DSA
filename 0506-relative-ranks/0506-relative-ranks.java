class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int pos = arr.length;
        
        ArrayList<Integer> li = new ArrayList<>();
        String[]dummy = new String[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            dummy[i] = String.valueOf(arr[i]);
            li.add(arr[i]);
        } 
        if(arr.length == 1){
            dummy[0] = "Gold Medal";
            return dummy;
        }
        if(arr.length == 2){
            if(arr[0] > arr[1]){
                dummy[0] = "Gold Medal";
                dummy[1] = "Silver Medal";
            }
            else{
                dummy[0] = "Silver Medal";
                dummy[1] = "Gold Medal";
            }

        }
        Arrays.sort(arr);
        if(arr.length > 3){
        for(int i = 0 ; i < arr.length - 3 ; i++){
            int index = li.indexOf(arr[i]);
            dummy[index] = String.valueOf(pos);
            pos--;
        }
    }
       if(arr.length >= 3){
        for(int i = arr.length - 3 ; i < arr.length ; i++){
            int index = li.indexOf(arr[i]);
            if(i == arr.length - 3 )
                 dummy[index] = "Bronze Medal";
            if(i == arr.length - 2)
                    dummy[index] = "Silver Medal";
            if(i == arr.length - 1)
                    dummy[index] = "Gold Medal";
        } 
       } 
        

        return dummy;
    }
}