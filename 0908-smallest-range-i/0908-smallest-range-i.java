class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int diff= max-min;
        if(diff<2*k){
            return 0;
        }
        else{
            return diff-2*k;
        }
        
        
    }
}