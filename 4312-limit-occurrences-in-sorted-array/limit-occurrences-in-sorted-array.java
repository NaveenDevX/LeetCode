class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int num : nums)
        {
             int count = map.getOrDefault(num,0);
             if(count < k)
             {
                list.add(num);
                map.put(num, count + 1);
             }
        }
        int [] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}