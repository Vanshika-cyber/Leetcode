class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k%n;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int col;
                if(i%2==0){
                    col = (k+j)%n;
                }else{
                    col = (j-k+n)%n;
                }
                if(mat[i][j]!=mat[i][col]) return false;
            }
        }
        return true;
    }
}