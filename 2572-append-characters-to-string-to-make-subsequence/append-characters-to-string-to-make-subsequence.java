class Solution {
    public int appendCharacters(String s, String t) {
        int start = 0;
        for (char ch : s.toCharArray()) {
            if (start < t.length() && ch == t.charAt(start)) {
                start++;
                if (start == t.length()) {
                    return 0;
                }
            }
        }
        return t.length() - start;
    }
}
