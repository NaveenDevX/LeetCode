class Solution {
    public int maxOperations(String s) {
       int res =0, ones =0;
       boolean one = false;
       for(char ch : s.toCharArray()){
            if(ch == '1')
            {
                ones++;
                one = true;
            }
            if(ch == '0' && one)
            {
                res += ones;
                one = false;
            }
       }
       return res;
    }
}