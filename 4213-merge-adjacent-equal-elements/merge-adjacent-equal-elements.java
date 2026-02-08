class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();
        for(long n : nums)
        {
            while(!stack.isEmpty() && stack.peek()==n)
            {
                n+=stack.pop();
            }
            stack.push(n);
        }
        return new ArrayList<>(stack);
    }
}