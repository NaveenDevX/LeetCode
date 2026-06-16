class Solution {
    public String processStr(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(ch == '#')
            {
                sb.append(sb.toString());
            }
            else if(ch == '%')
            {
                sb.reverse();
            }
            else if(ch == '*')
            {
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}