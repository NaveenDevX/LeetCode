class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0;
        int n = nums.length;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0 ; right < n ; right++)
        {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0)+1);

            while(map.get(num) > k){
                map.put(nums[left], map.getOrDefault(nums[left],0)-1);

                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}