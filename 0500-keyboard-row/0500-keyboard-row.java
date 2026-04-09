class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> ans = new ArrayList<>();

        for(String word : words){
            String w = word.toLowerCase();
            
            if(check(w,row1) || check(w,row2) || check(w,row3)){
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    boolean check(String w, String row){
        for(char c : w.toCharArray()){
            if(row.indexOf(c) == -1)
                return false;
        }
        return true;
    }
}