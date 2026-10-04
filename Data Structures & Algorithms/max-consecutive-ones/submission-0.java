class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = count + 1;
            }

            else {
                if (max < count) {
                    max = count;
                    count = 0;
                }
                else {
                    count = 0;
                }
            }
        }

        max = Math.max(count, max);
        return max;
    }
}