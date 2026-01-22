class Solution {
    public int minimumPairRemoval(int[] nums) {
     if(issorted(nums)){
        return 0;
     }   
     int minsum=nums[0]+nums[1];
     int idx=0;
     for(int i=1;i<nums.length-1;i++)
     {
        if(nums[i]+nums[i+1]<minsum){
            minsum=nums[i]+nums[i+1];
            idx=i;
        }
     }
     int [] newarr=new int[nums.length-1];
     int k=0;
     for(int i=0;i<nums.length;i++){
        if(i==idx){
            newarr[k++]=minsum;
            i++;
        }
        else{
            newarr[k++]=nums[i];
        }
     }
     return 1+minimumPairRemoval(newarr);
    }
     boolean issorted(int[] a)
     {
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1])
            return false;
        }
        return true;
     }
    
}