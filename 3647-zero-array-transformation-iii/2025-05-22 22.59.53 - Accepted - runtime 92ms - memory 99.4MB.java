class Solution {
  public int maxRemoval(int[] a, int[][] q) {
    int qi = 0;
    Queue<Integer> av = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> run = new PriorityQueue<>();                          
    Arrays.sort(q, Comparator.comparingInt((int[] x) -> x[0]));
    for (int i = 0; i < a.length; ++i) {
      while (qi < q.length && q[qi][0] <= i)
        av.offer(q[qi++][1]);
      while (!run.isEmpty() && run.peek() < i)
        run.poll();
      while (a[i] > run.size()) {
        if (av.isEmpty() || av.peek() < i)
          return -1;
        run.offer(av.poll());
      }
    }
    return av.size();
  }
}
