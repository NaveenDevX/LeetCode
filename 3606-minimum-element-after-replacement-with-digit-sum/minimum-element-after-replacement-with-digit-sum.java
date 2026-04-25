class Solution {
    public int minElement(int[] nums) {
        List<Integer>list = new ArrayList<Integer>();
        for(int num : nums)
        {
            int ele = sums(num);
            list.add(ele);
        }
        return Collections.min(list);
    }
    public int sums(int n)
    {
        int sum =0;
        while(n!=0)
        {
            sum += n % 10;
            n/=10;
        }
        return sum;
    }

}