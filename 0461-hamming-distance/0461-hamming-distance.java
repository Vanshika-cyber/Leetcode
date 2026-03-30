class Solution {
    public int hammingDistance(int x, int y) {
      int xor=x^y;
      int dis=0;
      while(xor!=0){
        dis+=xor&1;
        xor>>=1;
      }  
      return dis;
    }
}