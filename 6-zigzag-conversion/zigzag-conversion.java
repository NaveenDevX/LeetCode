class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int n = 2 * numRows - 2;
        HashMap<Integer,StringBuilder> hs = new HashMap<>();
        for (int j = 0; j < numRows; j++) {
            hs.put(j, new StringBuilder());
        }

        int i = 0;
        while (i < s.length()) {
            int cyclePos = i % n;
            int row = cyclePos < numRows ? cyclePos : n - cyclePos;
            hs.get(row).append(s.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < numRows; k++) {
            sb.append(hs.get(k));
        }
        return sb.toString();
    }
}
