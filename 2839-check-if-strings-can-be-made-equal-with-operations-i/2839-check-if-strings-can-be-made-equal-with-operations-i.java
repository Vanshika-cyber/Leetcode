class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char a = s1.charAt(0);
        char b = s1.charAt(1);
        char c = s1.charAt(2);
        char d = s1.charAt(3);
        char e = s2.charAt(0);
        char f = s2.charAt(1);
        char g = s2.charAt(2);
        char h = s2.charAt(3);
        boolean even = (a == e && c == g) || (a == g && c == e);
        boolean odd  = (b == f && d == h) || (b == h && d == f);

        return even && odd;
    }
}