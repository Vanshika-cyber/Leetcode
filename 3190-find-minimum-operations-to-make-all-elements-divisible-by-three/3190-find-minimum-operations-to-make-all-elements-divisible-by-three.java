class Solution {
    public int minimumOperations(int[] nums) 
    {
        int result=0;
        for(int n:nums){
            int r=n%3;
            if(r!=0){
               result+=Math.min(r,3-r);
            }
        }
        return result;
    }
}