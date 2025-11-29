class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(set.contains(s.charAt(i))) return s.charAt(i);
            else set.add(s.charAt(i));
        }
        return 'a';
    }
}