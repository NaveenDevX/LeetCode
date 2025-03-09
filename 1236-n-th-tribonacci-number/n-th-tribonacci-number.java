class Solution {
    public int tribonacci(int n) {
        if(n<2)
        {
            return n;
        }
        int n1=0,n2=1,n3=1,n4;
        while(n-->2)
        {
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n3;

        
    }
}