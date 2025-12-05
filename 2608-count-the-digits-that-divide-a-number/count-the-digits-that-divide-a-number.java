class Solution {
    public int countDigits(int num) {
       int count=0;
       int a = num;
       while(num>0){

        int n = num%10;
        if(a % n == 0 && n!=0) count++;
        num/=10;

       } 
       return count;
    }
}