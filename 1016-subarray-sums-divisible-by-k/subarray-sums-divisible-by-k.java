class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int sum=0;
       int res=0;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,1);
       for(int num : nums){
        sum+=num;
        int rem = sum % k;
        if(rem<0) rem+=k;
        if(map.containsKey(rem)){
            res+=map.get(rem);
            map.put(rem, map.getOrDefault(rem, 0)+1);        
            }
        else
       {
        map.put(rem,1);
       }
    }
    return res;

  }
}