class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res=  new int[nums.length];
        List<Integer> pos = new ArrayList<>();
        for(int num : nums)
        {
            if(num > 0) pos.add(num);
        }
        List<Integer> neg = new ArrayList<>();
        for(int num : nums)
        {
            if(num < 0) neg.add(num);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                res[i]=pos.get(0);
                pos.remove(0);
            }
            else{
                res[i]= neg.get(0);
                neg.remove(0);
            }
        }
        return res;

    }
}