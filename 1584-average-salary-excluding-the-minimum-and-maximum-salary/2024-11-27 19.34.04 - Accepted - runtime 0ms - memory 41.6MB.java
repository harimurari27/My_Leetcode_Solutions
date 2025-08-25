class Solution {
    public double average(int[] salary) 
    {
       int n=salary.length;
       int s=0;
       int min=salary[0];
       int max=salary[0];
       for(int i=0;i<n;i++)
       {
        s+=salary[i];
         if(salary[i]>max)
         {
            max=salary[i];
         }
         else if(salary[i]<min)
         {
            min=salary[i];
         }
       }
       double r=s-min-max;
       int  al=salary.length-2;
       double ans=r/al;
       return ans; 
    }
}