class Solution {
    public int maxSubstrings(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch, i);
            }
            else{
                if(i- map.get(ch)+1 >= 4){
                    ans++;
                    map.clear();
                }
            }
        }
        return ans;
    }
}