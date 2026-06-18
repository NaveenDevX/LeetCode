class Solution {

    public int diagonalPrime(int[][] nums) {

        int n = nums.length;
        int maxElement = 0;
        for (int[] row : nums) {
            for (int num : row) {
                maxElement = Math.max(maxElement, num);
            }
        }
        boolean[] prime = new boolean[maxElement + 1];

        for (int i = 2; i <= maxElement; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= maxElement; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= maxElement; j += i) {
                    prime[j] = false;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {

            if (prime[nums[i][i]]) {
                ans = Math.max(ans, nums[i][i]);
            }

            if (prime[nums[i][n - i - 1]]) {
                ans = Math.max(ans, nums[i][n - i - 1]);
            }
        }

        return ans;
    }
}