class Solution 
{
    public String largestGoodInteger(String nums) 
    {
        for(char i='9';i>='0';i--)
        {
            String s=""+i+i+i;
            if(nums.contains(s))
             return s;
        }
        return "";
    }
}