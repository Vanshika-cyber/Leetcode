class Solution {
     static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits)
     {     List<String> ll=new ArrayList<>();
           keypaid(digits,"",ll);
            return ll;
    }
    public static void keypaid(String ques , String ans, List<String> ll){ //239
        if(ques.length()==0){
            ll.add(ans);
            return ;
        }
        char ch= ques.charAt(0); //'2'
        String get=key[ch-'0']; // 2->abc
        for(int i=0;i<get.length();i++){
            keypaid(ques.substring(1),ans+get.charAt(i),ll);
        }
    }
}
