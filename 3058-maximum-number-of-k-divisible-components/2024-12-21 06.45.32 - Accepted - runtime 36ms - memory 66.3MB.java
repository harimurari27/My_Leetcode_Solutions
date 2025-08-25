class Solution {
    int count=0;
    public long dfs(List<Integer>[] tree,boolean[] visited, int[] values,int root,int k){
        visited[root]=true;
        long sum=0;
        for(int nei:tree[root]){
            if(!visited[nei]){
                long val = dfs(tree,visited,values,nei,k);
                if(val%k==0){
                    count++;
                }else{
                    sum+=val;
                }
            }
        }
        return sum+values[root];
    }
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] tree= new List[n];
        for(int i=0;i<n;i++){
            tree[i] = new ArrayList<>();
        }
        for(int[] edge:edges){
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        long sum = dfs(tree,visited,values,0,k);
        if(sum%k==0){
            count++;
        }
        return count;
    }
}