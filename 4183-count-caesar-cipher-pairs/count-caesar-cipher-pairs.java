class Solution {

    public List<Integer> gk(String word, int n)
    {
        List<Integer> curr = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            int diff = (word.charAt(i) - 'a') - (word.charAt(i+1) - 'a');

            if(diff >= 0) curr.add(diff);

            else curr.add(diff+26);
        }

        return curr;
    }

    public long countPairs(String[] words) {

        int len = words[0].length();
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for(String word : words)
        {
            List<Integer> list = gk(word, len);       
            map.put(list, map.getOrDefault(list,0)+1);
        }

        long res = 0;
        for(int p : map.values())
        {
            res += (long) p *(p-1) / 2;
        }
        return res;
    }  
}