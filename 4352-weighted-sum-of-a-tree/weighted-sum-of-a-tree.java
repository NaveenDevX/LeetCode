class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = parent.length;
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++)
        {
            list.get(parent[i]).add(i);
        }

        int [] depth = new int[n];
        depth[0]=1;
        int height = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int node = q.poll();
            for(int c : list.get(node))
            {
                depth[c] = depth[node]+1;
                height = Math.max(height, depth[c]);
                q.add(c);
            }
        }

        long total_weight = 0;
        for(int i=0;i<n;i++)
        {
            total_weight += (long) nums[i] * (height - depth[i] +1);
        }

        return total_weight;
    }
}