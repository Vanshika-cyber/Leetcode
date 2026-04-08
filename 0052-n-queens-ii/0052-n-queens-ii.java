class Solution {
     int count = 0;
    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag = new boolean[2*n];
        boolean[] anti = new boolean[2*n];
        solve(0, n, col, diag, anti);
        return count;
    }
    public void solve(int row, int n, boolean[] col, boolean[] diag, boolean[] anti){
        if(row == n){
            count++;
            return;
        }
        for(int c = 0; c < n; c++){
            if(col[c] || diag[row - c + n] || anti[row + c])
                continue;
            col[c] = true;
            diag[row - c + n] = true;
            anti[row + c] = true;
            solve(row + 1, n, col, diag, anti);
            col[c] = false;
            diag[row - c + n] = false;
            anti[row + c] = false;
        }
    }
}