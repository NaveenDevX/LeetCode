class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        HashSet<Double> set = new HashSet<>();
        while(left<right)
        {
            Double avg = (nums[left]+nums[right])/2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
        
    }
}