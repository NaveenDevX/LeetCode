class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            int first= colors[i];
            for(int j=i+1;j<n;j++)
            {
                if(first != colors[j])
                {
                   max = Math.max(max, Math.abs(i-j));
                }
            }
        }
        return max;
    }
}