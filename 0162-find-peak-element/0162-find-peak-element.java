class Solution {
    public int findPeakElement(int[] nums) {
        long max =  Long.MIN_VALUE;
        int p = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                p = i;
            }
        }
        return p;
    }
    
}