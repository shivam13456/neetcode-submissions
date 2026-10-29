class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        int index = recursionBinarySearch(nums, target, start, end);
        return index;
    }

    public int recursionBinarySearch(int nums[], int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] < target) {
            return recursionBinarySearch(nums, target, start = mid + 1, end);
        }
        else if (nums[mid] > target) {
            return recursionBinarySearch(nums, target, start, end = mid - 1);
        }
        else if (nums[mid] == target){
            return mid;
        }

        else {
            return -1;
        }
    }
}
