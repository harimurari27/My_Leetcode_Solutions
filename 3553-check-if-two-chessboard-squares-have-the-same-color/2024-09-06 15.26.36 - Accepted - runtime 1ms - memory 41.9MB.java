class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) 
    {
        int board[][]=new int[8][8];
        int rs=0;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                board[i][j]=rs;
                rs=1-rs;
            }
            rs=1-rs;
        }
        int r1=(int)(coordinate1.charAt(1)-'0'-1);
        int c1=(int)(coordinate1.charAt(0)-'a');
        int r2=(int)(coordinate2.charAt(1)-'0'-1);
        int c2=(int)(coordinate2.charAt(0)-'a');
        return board[r1][c1]==board[r2][c2];  
          }
}