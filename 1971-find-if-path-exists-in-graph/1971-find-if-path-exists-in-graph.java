class Solution {
    public boolean dfs(int node, int destination, ArrayList<ArrayList<Integer>> adj, int[]visited){
        if(node==destination) return true;
        visited[node]=0;
        for(int neigh:adj.get(node)){
            if(visited[neigh]==-1){
                if(dfs(neigh,destination,adj,visited)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int[]visited=new int[n];
        Arrays.fill(visited,-1);
        return dfs(source, destination, adj, visited);
    }
}