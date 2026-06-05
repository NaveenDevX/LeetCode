class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < words.length; k++) {

            String word = words[k];

            if (word.length() <= 2) {
                sb.append(word.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));

                for (int i = 1; i < word.length(); i++) {
                    sb.append(Character.toLowerCase(word.charAt(i)));
                }
            }

            if (k != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}