class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> res = new ArrayList<>();
       int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
       for(int num : nums)
       {
          max = Math.max(num, max);
          min = Math.min(num, min);
       }
       int [] freq = new int[max+1];
       for(int i=0;i<nums.length;i++)
       {
          freq[nums[i]]++;
       }

       for(int j= min;j<=max;j++)
       {
          if(freq[j]==0)
          {
              res.add(j);
          }
       }
       return res;
    }
}