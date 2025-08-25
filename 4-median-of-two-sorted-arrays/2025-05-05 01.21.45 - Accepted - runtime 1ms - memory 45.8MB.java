class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {

        int n=a.length;
        int m=b.length;
        int ma[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                ma[k++]=a[i++];
            }
            else
            {
                ma[k++]=b[j++];
            }
        }
        while(i<n)
        {
            ma[k++]=a[i++];

        }
        while(j<m)
        {
            ma[k++]=b[j++];
        }
        int ml=ma.length;
        if(ml%2==1)
        {
            return (float)ma[ml/2];
        }
        else 
        {
            return (float)(ma[ml/2-1]+ma[ml/2])/2;
        }
    }
}