class Solution 
{
    public String resultingString(String s) 
    {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            int l = res.length();
            if (l > 0 && sol(res.charAt(l - 1), c)) 
            {
                res.deleteCharAt(l - 1);
            } 
            else 
            {
                res.append(c); 
            }
        }
        return res.toString();
    }
    private boolean sol(char a, char b) 
    {
        return Math.abs(a - b) == 1 || (a == 'a' && b == 'z') || (a == 'z' && b == 'a');
    }
}
