class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0, n = nums.length - 1;

       for (int i = 0; i <= n; i++) {
        int sum = 0;
        for (int j = i; j <= n; j++) {
            sum = sum + nums[j];
            if (sum == k) {
                count = count + 1;
            }
        }
       }
       return count;
    }
}