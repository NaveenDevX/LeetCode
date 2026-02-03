class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(nums[i]))
            {
                arr.add(i);
            }
        }
        int n = arr.size();
        return arr.get(n-1)- arr.get(0);
        

        
    }
    public boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}