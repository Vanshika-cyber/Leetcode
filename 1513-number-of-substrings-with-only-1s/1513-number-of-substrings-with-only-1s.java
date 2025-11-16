class Solution {
    public int numSub(String s) {
        int MOD = 1000000007;
        int count = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                ans = (ans + count) % MOD;
            } else {
                count = 0;
            }
        }
        return ans;
    }
}
