class Solution {
    public long countVowels(String word) {
        long ans = 0;
        int n = word.length();
        int i=0;
        for(char ch : word.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                ans += ((long)(n-i) * (long)(i+1));
            }
            i++;
        }
        return ans;
    }
}