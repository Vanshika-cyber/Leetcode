class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];  // Copy nums2 to end of nums1
        }
        Arrays.sort(nums1);  // Sort the entire nums1 array
    }
}
