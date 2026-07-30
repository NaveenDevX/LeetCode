class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits.length() == 0)
            return res;

        fun(digits, res, 0, "");

        return res;
    }

    public void fun(String digits, List<String> res, int index, String curr) {

        String[] words = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        if (index == digits.length()) {
            res.add(curr);
            return;
        }

        String s = words[digits.charAt(index) - '0'];

        for (int i = 0; i < s.length(); i++) {
            fun(digits, res, index + 1, curr + s.charAt(i));
        }
    }
}