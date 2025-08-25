class Solution {

    public int computeArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        
    int x5=Math.max(x1,x3);
    int y5=Math.max(y1,y3);
 
    int x6=Math.min(x2, x4);
    int y6=Math.min(y2, y4);
    boolean flag=true;
    if (x5 > x6 || y5 > y6) 
        flag=false;

    int area1=(x2-x1)*(y2-y1);
    int area2=(x4-x3)*(y4-y3);

    int ans=area1+area2;
    if(flag)
    ans-=(x6-x5)*(y6-y5);

    return ans;
    }
}