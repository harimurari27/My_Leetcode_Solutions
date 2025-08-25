class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int c1=0;
        int c2=0;
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i:nums1)
        {
            s.put(i,s.getOrDefault(i,0)+1);
        }
         HashMap<Integer,Integer> s2=new HashMap<>();
         for(int i:nums2)
        {
            s2.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i:nums1)
        {
            if(s2.get(i)!=null) c1++;
        }
        for(int i:nums2)
        {
            if(s.get(i)!=null) c2++;
        }
        int a[]={c1,c2};
        return a;

    }
}