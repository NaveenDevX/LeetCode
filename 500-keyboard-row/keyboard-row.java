class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        
        String k1 = "QWERTYUIOPqwertyuiop";
        String k2 = "ASDFGHJKLasdfghjkl";
        String k3 = "ZXCVBNMzxcvbnm";
        
        HashMap<Character, Boolean> m1 = new HashMap<>();
        for (char ch : k1.toCharArray()) m1.put(ch, true);

        HashMap<Character, Boolean> m2 = new HashMap<>();
        for (char ch : k2.toCharArray()) m2.put(ch, true);

        HashMap<Character, Boolean> m3 = new HashMap<>();
        for (char ch : k3.toCharArray()) m3.put(ch, true);

        for (String s : words) {
            if (isValid(s, m1)) {
                arr.add(s);
            } else if (isValid(s, m2)) {
                arr.add(s);
            } else if (isValid(s, m3)) {
                arr.add(s);
            }
        }
        
        return arr.toArray(new String[0]);
    }

    public boolean isValid(String word, HashMap<Character, Boolean> map) {
        for (char ch : word.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
        }
        return true;
    }
}