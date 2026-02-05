class Solution {
    public int minAddToMakeValid(String s) {
        int op=0, clo=0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                op++;
            }
            else if(op>0)
            {
                op--;
            }
            else{
                clo++;
            }
        }
        return op+clo;
    }
}