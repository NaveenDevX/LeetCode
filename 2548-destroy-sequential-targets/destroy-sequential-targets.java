class Solution {
    public int destroyTargets(int[] nums, int space) {
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int ele = num % space;
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int max = 0;
        for(int n : map.values())
        {
            max = Math.max(n, max);
        }
         
        for(int num : nums)
        {
            if(map.get(num % space) == max)
            {
                ans = Math.min(ans, num);
            }
        }
        
        return ans;
    }
}