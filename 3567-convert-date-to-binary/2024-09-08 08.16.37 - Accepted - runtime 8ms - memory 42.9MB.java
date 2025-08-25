class Solution {
    public String convertDateToBinary(String date) 
    {
      String parts[]=date.split("-");
      int yr=Integer.parseInt(parts[0]);
      int mn=Integer.parseInt(parts[1]);
      int day=Integer.parseInt(parts[2]);
      String yb=Integer.toBinaryString(yr);
      String mb=Integer.toBinaryString(mn);
      String db=Integer.toBinaryString(day);
      return yb+"-"+mb+"-"+db;
    }
}