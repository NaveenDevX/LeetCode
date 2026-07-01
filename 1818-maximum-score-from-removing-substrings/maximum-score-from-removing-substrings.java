class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        char first = x > y ? 'a' : 'b';
        char second = x > y ? 'b' : 'a';
        int high = Math.max(x, y);
        int low = Math.min(x, y);

        StringBuilder st1 = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (st1.length() > 0 && st1.charAt(st1.length() - 1) == first && ch == second) {
                st1.deleteCharAt(st1.length() - 1);
                score += high;
            } else {
                st1.append(ch);
            }
        }

        StringBuilder st2 = new StringBuilder();
        for (int i = 0; i < st1.length(); i++) {
            char ch = st1.charAt(i);
            if (st2.length() > 0 && st2.charAt(st2.length() - 1) == second && ch == first) {
                st2.deleteCharAt(st2.length() - 1);
                score += low;
            } else {
                st2.append(ch);
            }
        }

        return score;
    }
}