class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            arr.add(weights[i]+weights[i+1]);
        }
        Collections.sort(arr);
        long maxk=0;
        long mink=0;
        for(int i=0;i<k-1;i++){
            mink=mink+arr.get(i);
            maxk=maxk+arr.get(n-i-2);
        }
        return maxk-mink;
    }
}