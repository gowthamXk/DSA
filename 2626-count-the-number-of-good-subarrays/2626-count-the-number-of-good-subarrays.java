class Solution {
    public long countGood(int[] nums, int k) {
        return countSubarraysWithAtLeastKPairs(nums, k);
    }

    public long countSubarraysWithAtLeastKPairs(int[] nums, int k) {
        long total = 0;
        long pair = 0;
        int left = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            int count = freq.getOrDefault(val, 0);
            pair += count;
            freq.put(val, count + 1);

            while (pair >= k) {
                total += nums.length - right;
                int leftVal = nums[left];
                int leftCount = freq.get(leftVal);
                freq.put(leftVal, leftCount - 1);
                pair -= (leftCount - 1); 
                left++;
            }
        }

        return total;
    }
}
