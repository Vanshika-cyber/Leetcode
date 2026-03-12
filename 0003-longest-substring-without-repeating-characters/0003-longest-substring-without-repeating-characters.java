class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            int l=0;
            for(int j=i;j<s.length();j++){
                boolean duplicate=false;
                for(int k=i;k<j;k++){
                    if(s.charAt(k)==s.charAt(j)){
                        duplicate=true;
                        break;
                    }
                }
                if(duplicate){
                    break;
                }
                l++;
            }
            if(l>maxlength){
                maxlength=l;
            }
        }
       return maxlength;
    }
}
