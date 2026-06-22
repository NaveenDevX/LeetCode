class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()[0] == ch)
            {
                st.peek()[1]++;

                 if(st.peek()[1]==k){
                    st.pop();
                 }
            }
            
            else{
                st.push(new int[]{ch,1});
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int [] arr : st)
        {
            char ch = (char)arr[0];
            int length = arr[1];
            for(int i=0;i<length;i++)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}