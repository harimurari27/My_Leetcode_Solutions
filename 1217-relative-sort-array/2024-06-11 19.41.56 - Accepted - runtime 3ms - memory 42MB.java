class Solution
 {
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
       int output[]=new int[arr1.length];
       int temp=0;
       for(int i=0;i<arr2.length;i++)
       {
         int m=arr2[i];
         for(int j=0;j<arr1.length;j++)
         {
            if(m==arr1[j])
            {
                output[temp++]=m;
            }
         }
       }
       int k=0;
       ArrayList<Integer> a=new ArrayList<Integer>();
       for(int i=0;i<arr1.length;i++)
       {
        int m=arr1[i];
        for(int j=0;j<arr2.length;j++)
        {
            if(m==arr2[j])
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            a.add(m);
        }
        k=0;
       } 
       Collections.sort(a);
       for(int i=0;i<a.size();i++)
       {
         output[temp++]=a.get(i);
       }
       return output;
    }
}