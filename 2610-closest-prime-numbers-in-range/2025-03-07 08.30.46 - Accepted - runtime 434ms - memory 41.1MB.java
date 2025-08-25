class Solution {
    public int[] closestPrimes(int left, int right) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        int min = Integer.MAX_VALUE;
        for(int i=left;i<right;i++){
            if(isPrime(i)){
                for(int j = i+1;j<=right;j++){
                    if(isPrime(j)){
                        if(min>j-i){
                            res[0] = i;
                            res[1] = j;
                            min = j-i;
                        }
                        break;
                    }
                }
            }
            if(min==1 || min==2) return res;
        }
        return res;
    }
    public boolean isPrime(int n){
        if(n==1) return false;
        int i = 2;
        while(i<n){
            if(n%i==0) return false;
            i++;
        }
        return true;
    }
}