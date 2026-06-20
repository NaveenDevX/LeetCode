class Solution {
    public int totalMoney(int n) {
        int first = 0, count =0, ans =0;
        for(int i=1;i<=n;i++)
        {
            if(count == 7)
            {
                first = i/7+1;
                count =0;
            }
            else{
                first ++;
            }
            ans+=first;
            count++;
        }
        return ans;
    }
}