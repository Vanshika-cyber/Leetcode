class Solution {
    long mod=1000000007;
    public int pow(long a,long b){
        long res=1;
        while(b>0){
            if(b%2==1){
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            b>>=1;
        }
        return (int)res;
    }
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int sqrt=(int)Math.sqrt(nums.length);
        List<List<int[]>> ll=new ArrayList<>();
        for(int i=0;i<sqrt;i++){
            ll.add(new ArrayList<>());
        }
        for(int[] q:queries){
            int l=q[0];
            int r=q[1];
            int k=q[2];
            int v=q[3];
            if(k<sqrt){
                ll.get(k).add(new int[]{l,r,v});
            }
            else{
                for(int i=l;i<=r;i+=k){
                    nums[i]=(int)(((long)nums[i]*v)%mod);
                }
            }
        }
        long[] diff=new long[nums.length+sqrt];
        for(int k=1;k<sqrt;k++){
            if(ll.get(k).size()==0){
                continue;
            }
            Arrays.fill(diff,1);
            for(int[] q:ll.get(k)){
                int l=q[0];
                int r=q[1];
                int v=q[2];
                diff[l]=(diff[l]*v)%mod;
                int R=l+((r-l)/k+1)*k;
                diff[R]=(diff[R]*pow(v,mod-2))%mod;
            }
            for(int i=k;i<nums.length;i++){
                diff[i]=(diff[i]*diff[i-k])%mod;
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=(int)((nums[i]*diff[i])%mod);
            }
        }
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}