class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);
        int n = robot.size();
        int m = factory.length;
        long[][] dp = new long[n + 1][m + 1];
        for (long[] row : dp) Arrays.fill(row, Long.MAX_VALUE);
        dp[n][m] = 0;
        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i <= n; i++) {
                dp[i][j] = dp[i][j + 1];

                long cost = 0;

                for (int k = 1; k <= factory[j][1] && i + k <= n; k++) {
                    cost += Math.abs(robot.get(i + k - 1) - factory[j][0]);

                    if (dp[i + k][j + 1] != Long.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i][j],
                                cost + dp[i + k][j + 1]);
                    }
                }
            }
        }

        return dp[0][0];
    }
}