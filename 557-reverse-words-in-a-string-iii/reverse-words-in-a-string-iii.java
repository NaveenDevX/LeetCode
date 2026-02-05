class Solution {
    public String reverseWords(String s) {
         
         String [] arr= s.split(" ");
         int n = arr.length;
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<arr.length;i++)
         {
            String rev = new StringBuilder(arr[i]).reverse().toString();

            sb.append(rev);
            if(i<n-1)
            {
                sb.append(" ");
            }
         }
         return sb.toString();

    }
}