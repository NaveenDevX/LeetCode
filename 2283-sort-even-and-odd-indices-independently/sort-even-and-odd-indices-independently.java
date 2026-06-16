class Solution {
    public int[] sortEvenOdd(int[] nums) {
       List<Integer>e = new ArrayList<>();
       List<Integer>o = new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        if(i%2==0) e.add(nums[i]);
        else o.add(nums[i]);
       }

       Collections.sort(e);
       Collections.sort(o, Collections.reverseOrder());

       int i=0, j=0;
       for(int k=0;k<nums.length;k++)
       {
          if(k%2==0)
          {
            nums[k]= e.get(i);
            i++;
          }
          else{
            nums[k]= o.get(j);
            j++;
          }
       }
       return nums;
    }
}