class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        int [] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int m = (n+1)/2;
        for(int i=1;i<m;i++)
        {
            arr[2*i]=arr[i];
            arr[2*i+1]= arr[i]+arr[i+1];
        }
        int max =0;
        for(int num : arr)
        {
            max = Math.max(max, num);
        }
        return max;
        
    }
}