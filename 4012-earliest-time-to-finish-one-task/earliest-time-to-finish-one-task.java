class Solution {
    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            int sum =0;
            for(int t : tasks[i]) {
            sum+=t;
         }
         res= Math.min(res, sum);
        }
        return res;
        
    }
}