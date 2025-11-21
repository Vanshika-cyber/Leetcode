class Solution {
    public int countPalindromicSubsequence(String s)
     {
    int res = 0;
    for (char c = 'a'; c <= 'z'; c++) {
        int left = s.indexOf(c);
        int right = s.lastIndexOf(c);
        if (left != -1 && right - left > 1) {
            boolean[] middle = new boolean[26];
            for (int i = left + 1; i < right; i++) {
                middle[s.charAt(i) - 'a'] = true;
            }
            for (boolean m : middle) {
                if (m) res++;
            }
        }
    }
    return res;
   }
 }