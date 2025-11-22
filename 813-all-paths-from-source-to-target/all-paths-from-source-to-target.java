class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph){
        List<Integer>path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path);
        return result;
    }
    public void dfs(int [][]graph, int node, List<Integer>path){
        if(node==graph.length-1){
            result.add(new ArrayList<>(path));
            return ;
        }
        for(int edge:graph[node])
        {
            path.add(edge);
            dfs(graph, edge, path);
            path.remove(path.size()-1);
        }
    }
}