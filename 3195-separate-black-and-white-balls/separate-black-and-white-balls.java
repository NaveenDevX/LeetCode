class Solution {
    public long minimumSteps(String s) {
        long res = 0;
        long ones = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                ones++;
            } else {
                res += ones;
            }
        }
        return res;
    }
}
