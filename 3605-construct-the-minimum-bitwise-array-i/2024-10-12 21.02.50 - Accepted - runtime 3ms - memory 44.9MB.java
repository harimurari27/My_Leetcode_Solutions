class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            int num=nums.get(i);
            boolean f=false;
            for(int j=0;j<=num;j++){
                if((j|(j+1))==num){
                    a[i]=j;
                    f=true;
                    break;
                }
            }
            if(!f){
                a[i]=-1;
            }

        }
        return a;
    }
}