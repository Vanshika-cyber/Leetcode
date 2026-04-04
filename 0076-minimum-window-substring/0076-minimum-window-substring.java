class Solution {
    public String minWindow(String s, String t) {

        int[] map=new int[128];

        for(char c:t.toCharArray())
            map[c]++;

        int left=0,count=t.length(),start=0,min=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){

            if(map[s.charAt(right)]-- >0)
                count--;

            while(count==0){

                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }

                if(map[s.charAt(left++)]++==0)
                    count++;
            }
        }

        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}