class Solution {
    public int[] findDiagonalOrder(int[][] arr ) 
    {
        int row = arr.length;
        int col = arr[0].length;
        int[] ans = new int[row * col];
        int idx=0;
        for (int d = 0; d < row + col - 1; d++) {
            int r, c;
            if (d < col) {
                r = 0;
                c = d;
            } 
            else {
                r = d - col + 1;
                c = col - 1;
            }
            ArrayList<Integer> ll=new ArrayList<>();
            while(r<row && c>=0){
                ll.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                 Collections.reverse(ll);
                for(int ele:ll){
                    ans[idx]=ele;
                    idx++;
                }
            }
            else
            {
               
                for(int ele:ll){
                    ans[idx]=ele;
                    idx++;
                }
            }
        }
        return ans;
    }
}
