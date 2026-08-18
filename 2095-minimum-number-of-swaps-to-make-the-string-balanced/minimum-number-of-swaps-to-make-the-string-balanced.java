class Solution {
    public int minSwaps(String s) {
        int ans = 0, zero = 0, count = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '[')
            {
                count++;
            }
            else{
                count--;
            }
            if(count < zero)
            {
                zero = count;
            }
        }
        ans = (Math.abs(zero)+1)/2;

        return ans;
    }
}