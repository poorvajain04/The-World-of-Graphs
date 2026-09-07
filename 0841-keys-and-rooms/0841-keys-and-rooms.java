class Solution {
    public boolean dfs(int node, List<List<Integer>> adj, int[] visited){
        visited[node]=0;
        for(int neigh:adj.get(node)){
            if(visited[neigh]==-1){
                if(!dfs(neigh,adj, visited)) return false;
            }
        }
        return true;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int[]visited=new int[n];
        Arrays.fill(visited,-1);
        visited[0]=0;
        dfs(0,rooms,visited);
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
             return false;
            }
        }
    return true;
    }
}