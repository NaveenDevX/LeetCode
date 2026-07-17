class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> (a[0]-b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int [] interval : intervals)
        {
            int first = interval[0];
            int second = interval[1];
            if(!pq.isEmpty() && first > pq.peek())
            {
                pq.poll();
            }
            pq.offer(second);
        }
        return pq.size();
    }
}