class Solution {
    public int[] twoSum(int[] nums, int target) {
            return twos(nums,target);
    }
     public static int[] twos(int[] arr,int target)
    {
        for (int i=0;i<arr.length;i++)
        {
            for( int j=i+1;j<arr.length;j++) {
                if (target==arr[i] + arr[j]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {} ;
    }
}
    
