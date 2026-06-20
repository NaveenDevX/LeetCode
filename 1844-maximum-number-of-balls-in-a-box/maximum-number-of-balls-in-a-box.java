class Solution {

    public int digits(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int n = digits(i);
            map.put(n, map.getOrDefault(n,0)+1);
            
        }
        int max =0;

        for(int num : map.values())
        {
            max = Math.max(max, num);
        }

         return max;  
    }
}