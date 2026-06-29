class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        int curr =0;
        Arrays.sort(intervals,(a,b) -> (a[0] == b[0] ? b[1]-a[1] : a[0]-b[0]));
        for(int [] interval : intervals)
        {
            if(curr < interval[1])
            {
                curr = interval[1];
                count++;
            }
        }
        return count;
    }
}