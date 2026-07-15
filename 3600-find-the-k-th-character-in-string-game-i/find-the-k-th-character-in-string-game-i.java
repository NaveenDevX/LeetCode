class Solution {
    public char kthCharacter(int k) {
        StringBuilder ans = new StringBuilder("a");

        while (ans.length() < k) {
            String temp = ans.toString();

            for (char ch : temp.toCharArray()) {
                ans.append((char) (ch + 1));
            }
        }

        return ans.charAt(k - 1);
    }
}