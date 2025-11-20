class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    
    int point1 = -1, point2 = -1;
    int result = 0;

    for (int[] interval : intervals) {
        int start = interval[0], end = interval[1];
        
        if (start > point2) {
            result += 2;
            point1 = end - 1;
            point2 = end;
        } else if (start > point1) {
           
            result += 1;
            point1 = point2;
            point2 = end;
        }

    }
    return result;
}
}
