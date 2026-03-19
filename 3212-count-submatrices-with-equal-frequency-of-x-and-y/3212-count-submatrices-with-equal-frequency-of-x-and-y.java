class Solution {
    public int numberOfSubmatrices(char[][] grid) { 
        int m = grid.length;
        int n = grid[0].length;

        int[][] xCount = new int[m][n];
        int[][] yCount = new int[m][n];

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int x = (grid[i][j] == 'X') ? 1 : 0;
                int y = (grid[i][j] == 'Y') ? 1 : 0;

                xCount[i][j] = x;
                yCount[i][j] = y;

                if (i > 0) {
                    xCount[i][j] += xCount[i - 1][j];
                    yCount[i][j] += yCount[i - 1][j];
                }
                if (j > 0) {
                    xCount[i][j] += xCount[i][j - 1];
                    yCount[i][j] += yCount[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    xCount[i][j] -= xCount[i - 1][j - 1];
                    yCount[i][j] -= yCount[i - 1][j - 1];
                }
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int x = xCount[i][j];
                int y = yCount[i][j];

                if (x == y && x > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}