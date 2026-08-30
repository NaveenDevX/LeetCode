class Solution {
    public int minimumDeletions(String word, int k) {
        
        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int res = Integer.MAX_VALUE;
        for(int num : map.values())
        {
            int min = num , max = num + k;
            int count = 0;
            for(int val : map.values())
            {
                if(val < min)
                {
                    count += val;
                }
                else if(val > max)
                {
                    count += (val - max);
                }
            }
            res = Math.min(res, count);         
        }
        return res;
    }
}