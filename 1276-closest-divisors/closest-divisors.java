class Solution {
    public int[] closestDivisors(int num) {

        int num1 = num + 1;
        int num2 = num + 2;

        int[] p1 = new int[2];
        int[] p2 = new int[2];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i * i <= num1; i++) {
            if (num1 % i == 0) {
                int diff = Math.abs(i - num1 / i);

                if (diff < min1) {
                    min1 = diff;
                    p1[0] = i;
                    p1[1] = num1 / i;
                }
            }
        }

        for (int i = 1; i * i <= num2; i++) {
            if (num2 % i == 0) {
                int diff = Math.abs(i - num2 / i);

                if (diff < min2) {
                    min2 = diff;
                    p2[0] = i;
                    p2[1] = num2 / i;
                }
            }
        }

        return (min1 < min2) ? p1 : p2;
    }
}