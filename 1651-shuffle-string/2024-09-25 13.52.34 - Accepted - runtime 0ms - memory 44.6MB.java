class Solution {
    public String restoreString(String s, int[] indices) 
    {
        int j=0;
        char c[]=new char[s.length()];
        for(int i:indices)
        {
            c[i]=s.charAt(j);
            j++;
        }
        //String str=new String(c);
        return new String(c);
    }
}