class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int a=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getKey()==e.getValue())
            a=e.getKey();
        }
        return a;
    }
}