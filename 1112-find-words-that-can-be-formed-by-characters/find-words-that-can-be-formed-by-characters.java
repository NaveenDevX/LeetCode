class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : chars.toCharArray())
        {
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(String word : words)
        {
            HashMap<Character, Integer> map2= new HashMap<>(map1);
            for(char ch : word.toCharArray())
            {
                if(map2.containsKey(ch) && map2.get(ch)!=0)
                {
                    map2.put(ch, map2.get(ch)-1);
                }
                else{
                    ans -= word.length();
                    break;
                }
            }
            ans += word.length();
        }
        return ans;
    }
}