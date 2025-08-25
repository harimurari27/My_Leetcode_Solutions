class Solution {
    public int binaryGap(int n) 
    {
        char arr[]=Integer.toBinaryString(n).toCharArray();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1') l.add(i);
        }
        if(l.size()==1) return 0;
        int a=0;
        for(int i=0;i<l.size()-1;i++)
        {
           a= Math.max(a,l.get(i+1)-l.get(i));
        }
      return a;
    }
}