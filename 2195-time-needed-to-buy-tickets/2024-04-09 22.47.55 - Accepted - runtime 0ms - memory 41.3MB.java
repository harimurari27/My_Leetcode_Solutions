 class Solution 
 {
  public int timeRequiredToBuy(int[] tickets, int k)
   {
    
    int t=0;

    for (int i = 0; i < tickets.length;i++)
      if (i <= k)
        t=t+Math.min(tickets[i], tickets[k]);
      else
        t=t+Math.min(tickets[i], tickets[k] - 1);
    return t;
  }
}
    