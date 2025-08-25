class Solution 
{
  public String smallestEquivalentString(String s1, String s2, String baseStr) 
  {
    StringBuilder r = new StringBuilder();
    UnionFind uf = new UnionFind(26);
    for (int i = 0; i < s1.length(); ++i)
      uf.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
    for (char c : baseStr.toCharArray())
      r.append((char) ('a' + uf.find(c - 'a')));
    return r.toString();
  }
}
class UnionFind 
{
  public UnionFind(int n) 
  {
    p = new int[n];
    for (int i = 0; i < n; ++i)
      p[i] = i;
  }
  public void union(int a, int b) 
  {
    int x = find(a);
    int y = find(b);
    if (x > y)
      p[x] = y;
    else
      p[y] = x;
  }
  public int find(int x) 
  {
    return p[x] == x ? x : (p[x] = find(p[x]));
  }
  private int[] p;
}