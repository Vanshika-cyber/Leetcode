class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        for(int end=0;end<=chars.length;end++) 
        {
            if (end == chars.length || chars[end] == ' ') {
                int left = start, right = end - 1;
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                start = end + 1;
            }
        }
        return new String(chars);
    }
}