class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        for(int num : nums)
        {
            if(num<=9)
            {
                a+=num;
            }
            else{
                b+=num;
            }
        }
        return a!=b;
        
    }
}