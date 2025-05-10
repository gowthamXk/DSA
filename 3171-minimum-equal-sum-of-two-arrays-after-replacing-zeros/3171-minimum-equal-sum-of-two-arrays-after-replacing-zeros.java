class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;

        long nums1zero = 0;
        long nums2zero = 0;

        long operating = 0;
        long totalsum = 0;
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] == 0){
                nums1zero++;
                nums1[i]+=1;
            }
            sum1 += nums1[i];
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if(nums2[i] == 0){
                nums2zero++;
                nums2[i]+=1;
            }
            sum2 += nums2[i];
        }
        if(sum1 == sum2 && (nums1zero ==0 && nums2zero == 0)){
            return sum1;
        }
        else if(sum1 == sum2 && (nums1zero == nums2zero)){
            return sum1 ;
        }

       if(sum1 < sum2 && nums1zero == 0){
          return -1;
       }
       if(sum2 < sum1 && nums2zero == 0){
          return -1;
       }
       return Math.max(sum1,sum2);

      

       
    }
}