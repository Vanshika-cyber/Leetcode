class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long m = grid.length;
        long n = grid[0].length;

        long total = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                total+=grid[i][j];
            }
        }
        if(total%2!=0) return false;
        long target = total/2;
        long curr = 0;
        for(int i = 0;i<m-1;i++){
            for(int j = 0;j<n;j++){
                curr+=grid[i][j];
            }
            if(curr == target) return true;
        }
        long currS = 0;
        for(int j = 0;j<n-1;j++){
            for(int i = 0;i<m;i++){
                currS+=grid[i][j];
            }
            if(currS == target) return true;
        }
        return false;
    }
}