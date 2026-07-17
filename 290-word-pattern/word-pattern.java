class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String [] arr = s.trim().split("\\s+");
        int n = pattern.length();
        if(arr.length != n) return false;
        for(int i=0;i<n;i++)
        {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(arr[i]))
                {
                    return false;
                }
            }
            else{
                if(map.containsValue(arr[i])) return false;
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}