class Solution{
    public int minSetSize(int [] arr){
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num : arr)
        {
           map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int ele : map.values())
        {
            pq.offer(ele);
        }

        int half = arr.length/2;
        int count = 0;
        int sum = 0;

        while(sum < half)
        {
            sum += pq.poll();
            count++;
        }
        return count;
    }
}