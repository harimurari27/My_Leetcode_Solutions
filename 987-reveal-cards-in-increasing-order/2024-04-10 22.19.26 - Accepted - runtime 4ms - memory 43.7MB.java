class Solution {
  public int[] deckRevealedIncreasing(int[] d) 
  {
     int n = d.length;

    Arrays.sort(d);

    Deque<Integer> dq = new ArrayDeque<>();
    dq.addFirst(d[n-1]);

    for (int i = n - 2; i >= 0; --i) 
    {
      dq.addFirst(dq.getLast());
      dq.pollLast();
      dq.addFirst(d[i]);
    }

    for (int i = 0; i < n; ++i)
    {
      d[i] = dq.pollFirst();
    }

    return d;
  }
}