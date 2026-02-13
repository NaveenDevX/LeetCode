class Solution {
    public String sortVowels(String s) {
        int n = s.length();

        List<Integer> vowelIndex = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();

        Set<Character> set = new HashSet<>(Arrays.asList(
            'A','E','I','O','U','a','e','i','o','u'
        ));

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                vowelIndex.add(i);
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);

        char[] result = s.toCharArray();

        for (int i = 0; i < vowelIndex.size(); i++) {
            int ind= vowelIndex.get(i);
            result[ind] = vowels.get(i);
        }

        return new String(result);
    }
}
