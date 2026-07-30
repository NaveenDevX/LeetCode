class Solution {
    public String stringHash(String s, int k) {
        String str = "";
        int n = s.length();
        for(int i=0;i<n;i+=k)
        {
            int sum = 0;
            for(int j=0;j<k;j++)
            {
                sum += (s.charAt(i+j)-'a');
            }
            int ascii = sum % 26;
            str += (char)(ascii + 'a');
        }

        return str;

    }
}