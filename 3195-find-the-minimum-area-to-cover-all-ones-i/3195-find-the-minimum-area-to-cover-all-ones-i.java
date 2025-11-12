class Solution {
    public int minimumArea(int[][] grid) {
       int row=grid.length;
       int col=grid[0].length;
       int left=Integer.MAX_VALUE;
       int top=-1,bottom=-1,right=-1;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(grid[i][j]==1){
            if(top==-1)
                top=i;
                bottom=i;
                left=Math.min(left,j);
                right=Math.max(right,j);
          }
        }
       }
          if(top==-1) return 0;
          return (bottom-top+1)*(right-left+1);
        }
}