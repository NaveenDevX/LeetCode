import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n != m) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n; i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0) != (freq2[i] == 0)) {
                return false;
            }
        }
        int[] sorted1 = freq1.clone();
        int[] sorted2 = freq2.clone();
        Arrays.sort(sorted1);
        Arrays.sort(sorted2);

        return Arrays.equals(sorted1, sorted2);
    }
}