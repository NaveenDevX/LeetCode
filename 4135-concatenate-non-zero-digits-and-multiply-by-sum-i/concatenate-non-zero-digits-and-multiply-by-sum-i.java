class Solution {
    public long sumAndMultiply(int n) {
       long digit = 0;
       long sum = 0;
       while(n>0){
         int temp = n % 10;
         if(temp != 0)
         {
            sum += temp;
            digit = digit * 10 + temp;
         }
         n/=10;
       }
       n = (int)digit;
       digit = 0;
       while(n>0){
        int temp = n % 10;
        digit = digit * 10 + temp;
        n/=10;
       }

       return sum * digit;
    }
}