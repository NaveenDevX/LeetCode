class Solution {
    public int minimumRounds(int[] tasks) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int t : tasks)
       {
        map.put(t, map.getOrDefault(t,0)+1);
       }
       int ans =0;
       for(int num : map.values())
       {
        if(num <= 1) return -1;

        ans +=(num+2)/3;
       }
       return ans;
       
       
    }
}