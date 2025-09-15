class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int mis=1;
        for(int num: nums)
        {
            if(num>0)
            {
               if(num==mis)
               {
                mis++;
               }
               else if(num>mis)
               {
                break;
               }
            }
        }
        return mis;
        
    }
}