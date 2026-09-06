class Solution {
    public boolean dfs(int node, int color, int[][] graph, int[] colour) {
        colour[node] = color;
        for (int neigh : graph[node]) {
            if (colour[neigh] == -1) {
                if (!dfs(neigh, 1 - color, graph, colour))
                    return false;
            }
            else if (colour[neigh] == colour[node]) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        Arrays.fill(colour, -1);
        for (int i = 0; i < n; i++) {
            if (colour[i] == -1) {
                if (!dfs(i, 0, graph, colour))
                    return false;
            }
        }
        return true;
    }
}