class Solution {
    Integer[][] dp;
    int[][] robots;
    int[] walls;
    int n;

    public int maxWalls(int[] r, int[] d, int[] w) {

        n = r.length;
        robots = new int[n][2];

        for(int i=0;i<n;i++){
            robots[i][0] = r[i];
            robots[i][1] = d[i];
        }

        Arrays.sort(robots,(a,b)->a[0]-b[0]);
        Arrays.sort(w);

        walls = w;
        dp = new Integer[n][2];

        return dfs(n-1,1);
    }

    int dfs(int i,int dir){

        if(i < 0) return 0;

        if(dp[i][dir] != null)
            return dp[i][dir];

        int pos = robots[i][0];
        int dist = robots[i][1];

        // shoot left
        int left = pos - dist;
        if(i > 0) left = Math.max(left, robots[i-1][0] + 1);

        int l = lowerBound(walls,left);
        int r = lowerBound(walls,pos+1);

        int ans = dfs(i-1,0) + (r-l);

        // shoot right
        int right = pos + dist;

        if(i+1 < n){
            if(dir==0)
                right = Math.min(right, robots[i+1][0] - robots[i+1][1] - 1);
            else
                right = Math.min(right, robots[i+1][0] - 1);
        }

        l = lowerBound(walls,pos);
        r = lowerBound(walls,right+1);

        ans = Math.max(ans, dfs(i-1,1) + (r-l));

        return dp[i][dir] = ans;
    }

    int lowerBound(int[] arr,int target){
        int l=0,r=arr.length;

        while(l<r){
            int mid=(l+r)/2;

            if(arr[mid] < target)
                l = mid+1;
            else
                r = mid;
        }

        return l;
    }
}