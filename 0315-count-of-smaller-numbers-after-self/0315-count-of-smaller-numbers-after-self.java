class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new LinkedList<>();
        List<Integer> sorted = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int index = binarySearch(sorted, nums[i]);
            result.add(0, index);
            sorted.add(index, nums[i]);
        }

        return result;
    }

    private int binarySearch(List<Integer> list, int target) {
        int left = 0, right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (list.get(mid) < target)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
}