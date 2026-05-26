class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int l = 0;
        int res = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            total += nums[r];

            while (total >= target) {
                res = Math.min(r - l + 1, res);
                total -= nums[l];
                l++;
            }
        }

        if (res == Integer.MAX_VALUE) {
            return 0;
        }

        return res;
    }
}