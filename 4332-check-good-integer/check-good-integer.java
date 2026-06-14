class Solution {
    public boolean checkGoodInteger(int n) {
        int digit_sum = 0;
        int square_sum = 0;

        while(n!=0)
        {
            int rem = n%10;
            digit_sum += rem;
            square_sum += (rem*rem);
            n/=10;
        }

        return (square_sum - digit_sum) >= 50;
    }
}