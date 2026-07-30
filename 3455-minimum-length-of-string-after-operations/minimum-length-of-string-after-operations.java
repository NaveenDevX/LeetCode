class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int [] freq = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(int i=0;i<freq.length;i++)
        {
            while(freq[i] >= 3)
            {
                freq[i] -= 2;
            }          
        }
        int sum = 0;
        for(int num : freq)
        {
            sum += num;
        }

        return sum;
    }
}