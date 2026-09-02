class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int fresh=0;
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new int[] {i,j});
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int minutes=-1;
        int[][] dimensions={
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
        };
        while(!queue.isEmpty()){
            int size=queue.size();
            minutes++;
            for(int i=0;i<size;i++){
                int[] arr=queue.poll();
                for(int[] dir:dimensions){
                    int x=arr[0]+dir[0];
                    int y=arr[1]+dir[1];
                    if(x<0||x>=m||y<0||y>=n||grid[x][y]==0||visited[x][y]) continue;
                    visited[x][y]=true;
                    fresh--;
                    queue.add(new int[]{x,y});
                }
            }
        }
        return fresh==0?minutes:-1;
    }
}