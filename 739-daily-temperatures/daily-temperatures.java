class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;

        int [] res = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && (temperatures[st.peek()] < temperatures[i]))
            {
                int temp = st.pop();
                res[temp] = i - temp;
            }
            st.push(i);
        }
        return res;
    }
}