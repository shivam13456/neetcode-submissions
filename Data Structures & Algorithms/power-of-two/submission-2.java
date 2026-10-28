class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = 0;

        if (n <= 0) {
            return false;
        }

        while (Math.pow(2, x) <= n) {
            if (n == Math.pow(2, x)) {
                return true;
            }
            x = x + 1;
        }
        return false;
    }
}