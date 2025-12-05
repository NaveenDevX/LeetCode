class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String num=String.valueOf(i);
            int length=num.length();
            if(length%2==0)
            {
                int mid=length/2;
                int f=0;
                int s=0;
                for(int j=0;j<mid;j++)
                {
                    f+=num.charAt(j)-'0';

                }
                for(int j=mid;j<length;j++)
                {
                    s+=num.charAt(j)-'0';
                }
                if(s==f)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}