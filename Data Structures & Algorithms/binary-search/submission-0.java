class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int idx = recursiveSearch (nums, target, s, e);
        return idx;
    }

    public int recursiveSearch (int[] nums, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if(nums[m] == target) {
            return m;
        }

        if(target > nums[m]) {
            return recursiveSearch (nums, target, m + 1, e);
        }

        return recursiveSearch (nums, target, s, m - 1);
    }
}
