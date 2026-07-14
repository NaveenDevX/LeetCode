class Solution {
    public int minMovesToMakePalindrome(String s) {
       List<Character> list = new ArrayList<>();
       for(char ch : s.toCharArray()){
          list.add(ch);
       }
       int ans = 0;
       while(!list.isEmpty())
       {
           int n = list.size();
           char ch = list.get(n-1);
           int min = 0;
           for(int i=0;i<n;i++)
           {
              if(list.get(i) == ch)
              {
                  min = i;
                  break;
              }
           }
           if(min == n-1){
              ans += ((n-1)/2);
              list.remove(n-1);
           }
           else{
           ans += min;
           list.remove(n-1);
           list.remove(min);
           }
       }

       return ans;
    }
}