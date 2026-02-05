class Solution {
    public List<Integer> lexicalOrder(int n) {
         ArrayList<Integer> ll = new ArrayList<>();
        lexicographical(0, n, ll);
        return ll;
    }
            public static void lexicographical(int curr, int n, ArrayList<Integer> ll) {
        if (curr > n) return;
        if(curr!=0) ll.add(curr);
        int i = 0;
        if(curr==0){
            i = 1;
        }
        for(;i<=9;i++){
            lexicographical(curr*10+i,n,ll);
        }


    }
}