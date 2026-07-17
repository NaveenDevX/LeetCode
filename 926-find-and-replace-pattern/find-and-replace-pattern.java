class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(isomorphic(words[i], pattern))
            {
                res.add(words[i]);
            }
        }
        return res;
    }
    public boolean isomorphic(String word, String p)
    {
        int n = word.length();
        if(word.length() != p.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch1 = word.charAt(i);
            char ch2 = p.charAt(i);
            if(map.containsKey(ch1))
            {
                if(map.get(ch1) != ch2) return false;
            }
            else{
                if(map.containsValue(ch2)) return false;

                map.put(ch1, ch2);
            }
        }
        return true;
    }
}