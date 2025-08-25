import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) 
    {
        BigInteger v=new BigInteger(num1);
        BigInteger v2=new BigInteger(num2);
        BigInteger v3=v.multiply(v2);
        String s=String.valueOf(v3);
        return s;
    }
}