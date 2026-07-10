class Solution {
    public int beautifulSubstrings(String s, int k) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            int vow = 0, cons = 0;
            for(int j=i;j<n;j++)
            {
                char ch = s.charAt(j);
                if(isVowel(ch)) vow++;
                else cons++;

                if(vow == cons && (vow * cons) % k == 0) ans++;
            }
        }
        return ans;
    }

    public boolean isVowel(char ch)
    {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if(set.contains(ch)) return true;

        return false;
    }
}