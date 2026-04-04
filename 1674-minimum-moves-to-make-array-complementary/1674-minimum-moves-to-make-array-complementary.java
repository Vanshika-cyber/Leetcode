class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {
            int a = nums[i], b = nums[n - 1 - i];
            int low = 1 + Math.min(a, b);
            int high = limit + Math.max(a, b);
            int sum = a + b;

            diff[2] += 2;
            diff[low]--;
            diff[sum]--;
            diff[sum + 1]++;
            diff[high + 1]++;
        }

        int ans = Integer.MAX_VALUE, cur = 0;

        for (int i = 2; i <= 2 * limit; i++) {
            cur += diff[i];
            ans = Math.min(ans, cur);
        }

        return ans;
    }
}