class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        Collections.sort(nums);
        int n = nums.size();
        int low = 0, high = (n+1)/2;
        int res = n;
        while(low < high && high < n)
        {
            if(nums.get(low) < nums.get(high))
            {
                low++;
                high++;
                res -= 2;
            }
            else{
                high++;
            }
        }
        return res;
    }
}