class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int cnt = 0;
        for(int n : map.values())
        {
            if(n <= 1)
            {
                return -1;
            }
            cnt += (n+2)/3;
        }

        return cnt;
    }
}