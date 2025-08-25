class Solution {
    public List<Integer> lexicalOrder(int n) 
    {
        List<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            al.add(String.valueOf(i));
        }
        Collections.sort(al);
        List<Integer> il=al.stream().map(Integer::parseInt).collect(Collectors.toList());
        return il;
    }
}