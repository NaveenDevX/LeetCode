class Solution {
    public int minSteps(int n) {
        List<Integer> list = new ArrayList<>();

        while(n%2 == 0)
        {
            list.add(2);
            n/=2;
        }
        for(int i=3;i*i<=n;i++)
        {
            while(n%i==0)
            {
                list.add(i);
                n/=i;
            }
        }

        if(n>1)
        {
            list.add(n);
        }

        int sum = 0;
        for(int num : list)
        {
            sum += num;
        }

        return sum;
    }
}