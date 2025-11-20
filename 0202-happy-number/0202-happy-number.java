class Solution {
    public boolean isHappy(int n) {
        boolean[] seen = new boolean[1000];
      while(n!=1){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        n=sum;
        if (seen[n]) return false;
        seen[n] = true;
      }
        return true;
    }
}
        