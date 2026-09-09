class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long start=1000;
        long commas=0;
        int c=1;
        while(start<=n){
            long end=start*1000-1;
            long count=Math.min(n,end)-start+1;
            if(count>0) commas+=count*c;
            start*=1000;
            c++;
        }
        return commas;
    }
}