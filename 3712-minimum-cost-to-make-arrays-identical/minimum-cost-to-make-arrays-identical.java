class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n= arr.length;
        long ans =0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.abs(arr[i]-brr[i]);
        }  
        long c = k;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++)
        {
            c+=Math.abs(arr[i]-brr[i]);
        }      
        
        return Math.min(ans,c);
    }
}