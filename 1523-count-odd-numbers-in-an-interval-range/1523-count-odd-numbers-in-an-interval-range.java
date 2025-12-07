class Solution {
    public int countOdds(int low, int high) 
    {
         // odds in [0, high]
        int oddsTillHigh = (high + 1) / 2;
        // odds in [0, low-1]
        int oddsBeforeLow = low / 2;
        // odds in [low, high]
        return oddsTillHigh - oddsBeforeLow;
    }
}