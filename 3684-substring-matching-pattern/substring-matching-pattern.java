class Solution {
    public boolean hasMatch(String s, String p) {
        boolean first_split = false;
        boolean second_split = false;

        int n = p.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int index = p.indexOf("*");

        for (int i = 0; i < n; i++) {
            if (i == index) break;
            else sb1.append(p.charAt(i));
        }

        for (int i = index + 1; i < n; i++) {
            sb2.append(p.charAt(i));
        }

        int firstIndex = s.indexOf(sb1.toString());
        if (firstIndex != -1) {
            int secondIndex = s.indexOf(sb2.toString(), firstIndex + sb1.length());
            if (secondIndex != -1) {
                first_split = true;
                second_split = true;
            }
        }
        return first_split && second_split;
    }
}