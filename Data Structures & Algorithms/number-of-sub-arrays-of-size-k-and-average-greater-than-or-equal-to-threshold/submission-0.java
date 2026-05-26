class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        threshold *= k;
        int curSum = 0;
        int res = 0;

        for (int r = 0; r < arr.length; r++) {
            curSum += arr[r];

            if (r >= k - 1) {
                if (curSum >= threshold) {
                    res++;
                }
                curSum -= arr[r - k + 1];
            }
        }
        return res;
    }
}