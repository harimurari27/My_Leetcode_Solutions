class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> hm.get(a)-hm.get(b));
        for(int i:hm.keySet())
        {
            pq.offer(i);
            if(pq.size()>k)
            pq.poll();
        }
        int res[]=new int[k];

        for(int i=k-1;i>=0;i--)
        {
        res[i]=pq.poll();
        }
        return res;
        
    }
}