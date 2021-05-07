class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = left & left + 1;
        left = left + 2;
        while (left <= right) {
            ans = ans & left;
            left = left + 1;
        }
        return ans;
    }
}
