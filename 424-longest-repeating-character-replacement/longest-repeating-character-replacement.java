class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int total=0;
        int ans=0;
        int [] count=new int[26];
        for(int right=0;right<s.length();right++)
        {
            total=Math.max(total,++count[s.charAt(right)-'A']);
            if(right-left+1-total>k)
            {
                count[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
            
        }
        return ans;
        
        
    }
}