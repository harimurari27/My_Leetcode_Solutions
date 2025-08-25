class Solution {
    public boolean areAlmostEqual(String s1, String s2) 
    {
        if(s1.equals(s2))
        {
            return true;
        }
        int n=s1.length();
        int f=-1;
        int s=-1;
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(f==-1)
                {
                    f=i;
                }
                else if(s==-1)
                {
                    s=i;
                }
                else
                {
                    return false;
                }
            }
        }
        /*char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            return true;
        }
        else
        {
            return false;
        }*/
    return (s!=-1&&s1.charAt(f)==s2.charAt(s)&&s1.charAt(s)==s2.charAt(f));
    }
}