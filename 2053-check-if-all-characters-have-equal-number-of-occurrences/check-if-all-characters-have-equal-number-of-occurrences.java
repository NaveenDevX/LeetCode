class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        Integer first = map.values().stream().findFirst().orElse(null);

        for(int num : map.values())
        {
            if(num != first) return false;
        }

        return true;
    }
}