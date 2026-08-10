class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
       Map<String, List<String>> map = new HashMap<>();
       for(String s : strs){
           char [] ch = s.toCharArray();
           Arrays.sort(ch);
           String sorted = new String(ch);
           map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
       }
       for(Map.Entry<String, List<String>> entry : map.entrySet()){
           List<String> list = new ArrayList<>(entry.getValue());
           res.add(list);
       }

       return res;
    }
}