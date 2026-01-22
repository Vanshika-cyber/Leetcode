class Solution {
    public List<String> generateParenthesis(int n)
     {
         List<String> ll=new ArrayList<>();
         parantheses(n,0,0,"",ll);
         return ll;

    }
     public static void parantheses(int n ,int open,int close, String  ans,List<String> ll) {
        // Base Case
        if(open==n && close==n) {
          //  System.out.println(ans);
            ll.add(ans);
            return ;
        }
        if(open>n || close>open) {
         return ;
        }
        parantheses(n,open+1,close,ans+"(",ll);
        parantheses(n,open,close+1,ans+")",ll);

    }
}