class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] ans = new int[2 * nums.length];
        
        if (nums.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}