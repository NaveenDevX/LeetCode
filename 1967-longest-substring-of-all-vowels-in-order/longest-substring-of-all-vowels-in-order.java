class Solution {
    public int longestBeautifulSubstring(String word) {
        if(word.length() < 5) return 0;
        
        int left = 0;
        int count = 1;
        int max = 0;
        int n = word.length();
        for(int right = 1;right<n;right++)
        {
             if(word.charAt(right) > word.charAt(right-1))
             {
                   count++;
             }
             else if(word.charAt(right) < word.charAt(right-1))
             {
                left = right;
                count = 1;
             }

             if(count == 5) max = Math.max(max, right-left+1);
        }
        
        return max;
    }
}