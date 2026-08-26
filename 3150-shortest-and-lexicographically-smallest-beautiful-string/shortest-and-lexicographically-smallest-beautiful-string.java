class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int left = 0, count = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') count++;

            while (count == k) {
                String curr = s.substring(left, right + 1);
                int m = curr.length();
                if (ans.isEmpty() || m < ans.length() || 
                    (m == ans.length() && curr.compareTo(ans) < 0)) {
                    ans = curr;
                }
                if (s.charAt(left) == '1') count--;
                left++;
            }
        }
        return ans;
    }
}