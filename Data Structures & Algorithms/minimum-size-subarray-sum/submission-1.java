class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int low = 0, high = 0;
        int currentSum = 0;
        
        while (high < nums.length) {
            currentSum = currentSum + nums[high];
            high = high + 1;

            while (currentSum >= target) {
                int currentWindowSize = high - low;

                minLenWindow = Math.min(currentWindowSize, minLenWindow);
                currentSum = currentSum - nums[low];
                low = low + 1;
            }
        }
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}