class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustee=new int[n+1];
        for(int[]arr: trust){
            trustee[arr[0]]--;
            trustee[arr[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trustee[i]==n-1) return i;
        }
        return -1;
    }
}