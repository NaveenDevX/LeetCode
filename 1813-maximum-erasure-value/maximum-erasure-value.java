class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int n= nums.length;
        HashMap<Integer, Boolean > map = new HashMap<>();
        int s1= Integer.MIN_VALUE;
        int s2= 0;
        for(int right=0; right< n;right++)
        {
            while(map.containsKey(nums[right])){
                map.remove(nums[left]);
                s2-=nums[left];
                left++;
            }
            s2+=nums[right];
            map.put(nums[right], true);
            s1= Math.max(s1, s2);

        }
        return s1;
        
    }
}