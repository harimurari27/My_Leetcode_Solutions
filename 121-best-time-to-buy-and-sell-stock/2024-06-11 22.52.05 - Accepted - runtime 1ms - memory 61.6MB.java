class Solution
 {
    public int maxProfit(int[] prices)
    {
      int min=10000;
      int p=0;
      for(int i=0;i<prices.length;i++)
      {
        min=Math.min(min,prices[i]);
        p=Math.max(p,prices[i]-min);
      }
      return p;
    }
}