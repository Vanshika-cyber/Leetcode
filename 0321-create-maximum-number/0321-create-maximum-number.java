class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        for (int i = Math.max(0, k - nums2.length); i <= Math.min(k, nums1.length); i++) {

            int[] a = pick(nums1, i);
            int[] b = pick(nums2, k - i);

            int[] merged = merge(a, b);

            if (greater(merged, ans))
                ans = merged;
        }

        return ans;
    }

    private int[] pick(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[k];
        int start = 0;

        for (int i = 0; i < k; i++) {
            int max = -1, index = start;

            for (int j = start; j <= n - (k - i); j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    index = j;
                }
            }

            res[i] = max;
            start = index + 1;
        }

        return res;
    }

    private int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, r = 0;

        while (i < a.length || j < b.length) {
            if (compare(a, i, b, j))
                res[r++] = a[i++];
            else
                res[r++] = b[j++];
        }

        return res;
    }

    private boolean compare(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }
        return j == b.length || (i < a.length && a[i] > b[j]);
    }

    private boolean greater(int[] a, int[] b) {
        return compare(a, 0, b, 0);
    }
}