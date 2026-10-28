class Solution {
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }

    public void reverseHelper(char[] c, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;

        reverseHelper(c, start + 1, end - 1);
    }
}