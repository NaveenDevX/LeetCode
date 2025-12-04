class Solution {
    public int countCollisions(String directions) {
        if(directions.length()<=1) return 0;
       int n = directions.length();
       int count=0;
       int left =0;
       int right = n-1;
       while(left<n && directions.charAt(left)=='L'){
        left++;
       } 
       while(right>0 && directions.charAt(right)=='R')
       {
        right--;
       }
       for(int i=left;i<=right;i++){
        if(directions.charAt(i)!='S')
        {
            count++;
        }
       }
       return count;

    }
}