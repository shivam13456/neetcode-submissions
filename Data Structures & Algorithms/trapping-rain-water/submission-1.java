class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        leftArr[0] = height[0];
        rightArr[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater = totalWater + Math.min(leftArr[i], rightArr[i]) - height[i];
        }
        return totalWater;
    }
}
