class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if (n == 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
}
