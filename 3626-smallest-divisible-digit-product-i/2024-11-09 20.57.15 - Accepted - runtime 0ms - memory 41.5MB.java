class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int p=pro(n);
            if(p%t==0){
                return n;
            }
            n++;
        }
    }
    public int pro(int n){
        int p=1;
        while(n>0){
            int d=n%10;
            p*=d;
            n/=10;
        }
        return p;
    }
}