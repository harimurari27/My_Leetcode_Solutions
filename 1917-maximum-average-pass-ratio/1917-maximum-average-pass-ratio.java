class Solution 
{
    public double maxAverageRatio(int[][] cls, int k) 
    {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int[] c : cls) 
        {
            pq.offer(new double[]{g(c[0], c[1]), c[0], c[1]});
        }
        while (k-- > 0) 
        {
            double[] x = pq.poll();
            int p = (int) x[1] + 1, t = (int) x[2] + 1;
            pq.offer(new double[]{g(p, t), p, t});
        }
        double s = 0;
        while (!pq.isEmpty()) 
        {
            double[] x = pq.poll();
            s += x[1] / x[2];
        }
        return s / cls.length;
    }
    private double g(int p, int t) 
    {
        return (double)(p + 1) / (t + 1) - (double)p / t;
    }
}