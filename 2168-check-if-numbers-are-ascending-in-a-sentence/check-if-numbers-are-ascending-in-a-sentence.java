class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) { 
                list.add(Integer.parseInt(token));
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}