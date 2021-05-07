class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for (int i : nums) {
            curr += i;
            ans = Math.max(curr, ans);
            if (curr < 0)
                curr = 0;
        }
        return ans;
    }
}
