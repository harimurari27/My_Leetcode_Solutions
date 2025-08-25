class Solution {
    public int maxProduct(int n) {
     String str=Integer.toString(n);
        int m=0;
      for(int i=0;i<str.length();i++)
          {
              int d1=str.charAt(i)-'0';
              for(int j=i+1;j<str.length();j++)
                  {
                      int d2=str.charAt(j)-'0';
                      m=Math.max(m,d1*d2);
                  }
          }
        return m;
    }
}