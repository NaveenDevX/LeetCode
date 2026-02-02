class Solution {
    public int countAsterisks(String s) {
       int count =0;
       String [] arr= s.split("\\|");
       ArrayList<String> res = new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
        if(i%2==0)
        {
            res.add(arr[i]);
        }
       }
       for(String str : res)
       {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='*') count++;
        }
       }
       return count;

    }
}