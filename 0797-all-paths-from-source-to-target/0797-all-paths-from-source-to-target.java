class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, graph, new ArrayList<>(), ans);
        return ans;
    }
    public void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> ans) {
        path.add(node);
        if (node == graph.length - 1) {
            ans.add(new ArrayList<>(path));
        } 
        else {
            for (int next : graph[node]) {
                dfs(next, graph, path, ans);
            }
        }
        path.remove(path.size() - 1);
    }
}