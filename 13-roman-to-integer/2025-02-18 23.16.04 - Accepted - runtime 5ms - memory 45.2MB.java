class Solution {
    public int romanToInt(String s) 
    {
        int r=0;
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        for(int i=0;i<s.length()-1;i++)
        {
            if(h.get(s.charAt(i))<h.get(s.charAt(i+1)))
            {
                r-=h.get(s.charAt(i));
            }
            else
            {
                r+=h.get(s.charAt(i));
            }
        }
        return r+h.get(s.charAt(s.length()-1));
    }
}