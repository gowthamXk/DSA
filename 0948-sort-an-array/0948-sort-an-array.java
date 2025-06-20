class Solution {

    public int[] sortArray(int[] nums) {
        mergesort(nums , 0 , nums.length - 1);
        return nums;
    }
    public void mergesort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;

         mergesort(arr , low , mid);
         mergesort(arr , mid + 1 , high);

         merge( arr , low , mid , high);

    }

    public void merge(int[] arr , int low , int mid , int high){
        int i = low;
        int j = mid + 1;
        List<Integer> li = new ArrayList<>();
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                li.add(arr[i]);
                i++;
            }
            else{
                li.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
            li.add(arr[i]);
            i++;
        }
        while(j <= high){
            li.add(arr[j]);
            j++;
        }
        for(int k = low ; k <= high ; k++ ){
            arr[k] = li.get(k - low);
        }
        return;
    }
}