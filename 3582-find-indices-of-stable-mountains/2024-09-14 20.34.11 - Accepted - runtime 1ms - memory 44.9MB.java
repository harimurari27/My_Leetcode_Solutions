class Solution {
    public List<Integer> stableMountains(int[] height, int threshold)
     {
        int n=height.length;
         ArrayList<Integer> al=new ArrayList<>();
        int ind=0;
        for(int i=1;i<n;i++)
        {
            if(height[i-1]>threshold)
            {
            al.add(i);
            }
        }
     return al;

    }
}