class Solution {
    public int numSub(String s) {
      long MOD = 1000000007;
      long count =0;
      long res= 0;
      for(char c:s.toCharArray()){
        if(c=='1'){
            count++;
            res= (res+count) % MOD;
        }
        else{
            count = 0;
        }
      } 
      return (int) res;
    }
}