class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> reverse = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reverse.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int next : graph[i]) {
                reverse.get(next).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        boolean[] safe = new boolean[n];
        while (!q.isEmpty()) {
            int node = q.poll();
            safe[node] = true;
            for (int next : reverse.get(node)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}