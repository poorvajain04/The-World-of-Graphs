class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]!=-1)continue;
            Queue<Integer>q=new LinkedList<>();
            q.add(i);
            color[i]=0;
            while(!q.isEmpty()){
                int node=q.poll();
                for(int neigh:graph[node]){
                    if(color[neigh]==-1){
                        color[neigh]=1-color[node];
                        q.add(neigh);
                    }
                    else if(color[neigh]==color[node]) return false;
                }
            }
        }
        return true;
    }
}