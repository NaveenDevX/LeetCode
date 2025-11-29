class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        int count=0;
        for(int n : map.values()){
         if(n==maxFreq){
            count++;
         }
         else if(n> maxFreq){
            maxFreq=n;
            count=1;
         }
        }
        return maxFreq * count;
    }
}