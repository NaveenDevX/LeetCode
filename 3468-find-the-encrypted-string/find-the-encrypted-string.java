class Solution {
    public String getEncryptedString(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            int ind = (i+k)%s.length();
            str+=s.charAt(ind);
        }
        return str;
    }
}