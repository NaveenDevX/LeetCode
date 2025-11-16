class Solution {
    public int minimumMoves(String s) {
       int res=0,i=0;
       int n=s.length();
       while(i<n)
       {
        if(s.charAt(i)=='X')
        {
            res++;
            i+=3;
        }
        else{
            i++;
        }
       }
       return res;
    }
}