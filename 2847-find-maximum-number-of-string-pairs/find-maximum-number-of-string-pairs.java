class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words)
        {
            char [] ch = word.toCharArray();
            Arrays.sort(ch);
            String curr = new String(ch);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
        int ans = 0;
        for(int num : map.values())
        {
            if(num == 2)ans++;
        }
        return ans;
    }
}