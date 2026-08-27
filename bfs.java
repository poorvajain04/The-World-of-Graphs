import java.util.*;
public class bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            Integer node=queue.poll();
            bfs.add(node);
            for(Integer i:adj.get(node)){
                if(visited[i]==false){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        int V=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);
        bfs obj = new bfs();
        ArrayList<Integer> result = obj.bfsOfGraph(V, adj);
        System.out.println(result);

    }
}
