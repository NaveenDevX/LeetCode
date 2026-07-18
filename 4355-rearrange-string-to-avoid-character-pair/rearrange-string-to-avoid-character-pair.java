class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(ch == y)
            {
                sb1.append(ch);
            }
            else if(ch == x)
            {
                sb2.append(ch);
            }
            else{
                sb3.append(ch);
            }
        }
        return sb1.toString() + sb3.toString() + sb2.toString();
    }
}