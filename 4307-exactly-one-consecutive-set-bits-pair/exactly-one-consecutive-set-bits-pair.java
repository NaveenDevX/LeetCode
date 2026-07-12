class Solution {
    public boolean consecutiveSetBits(int n) {
        String binary = Integer.toBinaryString(n);

        char [] ch = binary.toCharArray();

        int len = ch.length;

        int count = 0;

        for(int i=1;i<len;i++)
        {
            if(ch[i] == '1' && ch[i-1]=='1')
            {
                count++;
            }
        }

        return count == 1;
    }
}