class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer> ans = new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();
       
       int i = 1;
       while(i<=9)
       {
           q.offer(i);
           i++;
       }
       while(!q.isEmpty())
       {
           int n = q.poll();

           if(n >= low && n <= high)
           {
                ans.add(n);
           }
           int digit = n % 10;
           if(digit < 9){
           int next_digit = n * 10 + digit + 1;
           if(next_digit <= high)
           {
               q.offer(next_digit);
           }
       }
    }

       return ans;
    }
}