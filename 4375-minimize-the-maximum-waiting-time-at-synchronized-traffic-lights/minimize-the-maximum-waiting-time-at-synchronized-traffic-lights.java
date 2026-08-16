class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = 0;
        int n = arrivalTime.length;
        for(int light : lights)
        {
            max = Math.max(max, light);
        }
        int [] time = new int[n];
        for(int i=0;i<n;i++)
        {
            time[i] = (arrivalTime[i] % period);
        }
        int min_time = 0;
        for(int i=0;i<n;i++)
        {
            if(time[i] >= max)
            {
                int diff = period - time[i];  
                min_time = Math.max(min_time,diff);             
            }
        }
        return min_time; 
    }
}