class Solution {
   
   public boolean isPrime(int num)
   {
     if(num<=1) return false;

     for(int i=2;i*i<=num;i++)
     {
        if(num % i == 0) return false;
     }
     return true;
   }

    public int diagonalPrime(int[][] nums) {
        List<Integer> list1 = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            list1.add(nums[i][i]);
            list1.add(nums[i][n-i-1]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int num : list1)
        {
            if(isPrime(num))
            {
                list2.add(num);
            }
        }

        int max =0;
        for(int num : list2)
        {
            max = Math.max(max, num);
        }
    return max;
    }
}