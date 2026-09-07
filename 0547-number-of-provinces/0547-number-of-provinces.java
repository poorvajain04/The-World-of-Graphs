class Solution {
    public void dfs(int city, int[][] isConnected, int[] visited) {
        visited[city] = 0;
        for (int neigh = 0; neigh < isConnected.length; neigh++) {
            if (isConnected[city][neigh] == 1 && visited[neigh] == -1) {
                dfs(neigh, isConnected, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                provinces++;
                dfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
}