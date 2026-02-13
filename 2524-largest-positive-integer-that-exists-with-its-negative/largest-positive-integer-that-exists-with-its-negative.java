class Solution {
    public int findMaxK(int[] nums) {
        int max =0;
        HashSet<Integer>set= new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        for(int num : set)
        {
            if(num > 0 && set.contains(-num))
            {
                 max = Math.max(max, num);
            }
        }
       return (max==0)?-1 : max; 
    }
}