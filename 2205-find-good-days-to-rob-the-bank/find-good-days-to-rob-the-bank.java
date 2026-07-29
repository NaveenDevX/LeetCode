class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans = new ArrayList<>();
        int n = security.length;
        int [] lis = new int[n];
        int [] lds = new int[n];
        lis[0]=1;
        lds[0]=1;
        int c1=1, c2=1;
        for(int i=1;i<n;i++)
        {
            if(security[i] >= security[i-1])
            {
                c1++;
                lis[i] = c1;
            }
            else{
                c1=1;
                lis[i]=c1;
            }
        }
        for(int i=1;i<n;i++)
        {
            if(security[i] <= security[i-1])
            {
                c2++;
                lds[i]=c2;
            }
            else{
                c2 = 1;
                lds[i] = c2;
            }
        }
        for(int i = time; i < n - time; i++){
            if(lds[i] >= time+1 && lis[i+time] >= time+1)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}