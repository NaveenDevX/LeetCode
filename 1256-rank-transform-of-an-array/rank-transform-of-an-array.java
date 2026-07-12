class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int n = arr.length;
       int [] copy = Arrays.copyOf(arr, n);

       Arrays.sort(copy);
       int count = 1;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num : copy)
       {
           if(!map.containsKey(num))
           {
              map.put(num, count++);
           }
       }
       int [] res = new int[n];
       for(int i=0;i<n;i++)
       {
           res[i] = map.get(arr[i]);
       } 

       return res;   
    }
}