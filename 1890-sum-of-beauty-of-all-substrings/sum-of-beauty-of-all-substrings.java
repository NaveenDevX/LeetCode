class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum =0;
        for(int i=0;i<n;i++)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<n;j++)
            {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch,0)+1);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int num : map.values())
            {
                min = Math.min(min, num);
                max = Math.max(max, num);

            }
             sum += (max - min);
            }
        }
        return sum;
    }
}