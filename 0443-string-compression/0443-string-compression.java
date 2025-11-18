class Solution {
    public int compress(char[] chars) {
        int write=0;
        int read=0;
        int n=chars.length;
        while(read<n){
            int start=read;
            while(read<n && chars[read]==chars[start]){
                read++;
            }
            chars[write++]=chars[start];
            int count=read-start;
            if(count>1){
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        } 
        return write;

    }
}
