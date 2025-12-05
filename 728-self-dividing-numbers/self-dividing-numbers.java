class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean ok = true;
            while (num > 0) {
                int d = num % 10;
                if (d == 0 || i % d != 0) {
                    ok = false;
                    break;
                }
                num /= 10;
            }
            if (ok) result.add(i);
        }
        return result;
    }
}
