class Solution {
    public boolean checkPerfectNumber(int num) 
    {
      int c=num;
      for(int i=1;i<num;i++)
      {
        if(num%i==0)
        {
            c=c-i;
        }
      }
      return c==0;  
    }
}