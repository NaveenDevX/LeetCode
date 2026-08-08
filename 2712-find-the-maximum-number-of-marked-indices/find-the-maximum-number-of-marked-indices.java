class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        int half = n/2;
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        for(int i=0;i<half;i++)
        {
            l1.add(nums[i]);
        }
        for(int i=half;i<n;i++)
        {
            l2.add(nums[i]);
        }
        int i=0, j= 0;
        while(i<half && j<n)
        {
            if((2*nums[i] <=  nums[j]))
            {
                i++;
                j++;
                res+=2;
            }
            else{
                j++;
            }
        }
        return res;
    }
}