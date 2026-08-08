class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for(int j=i;j<n;j++)
            {
                list.add(nums[j]);

                if(nums[j] % p == 0)count++;

                if(count > k) break;

                set.add(new ArrayList<>(list));
            }
        }
        return set.size();
    }
}