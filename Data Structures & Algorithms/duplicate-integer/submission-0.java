class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();

        for (int number : nums) {
            if (seen.contains(number)) {
                return true;
            } else {
                seen.add(number);
            }
        }
        return false;
    }
}