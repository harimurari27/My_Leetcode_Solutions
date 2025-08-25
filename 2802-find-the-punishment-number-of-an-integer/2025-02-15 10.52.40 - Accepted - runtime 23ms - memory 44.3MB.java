class Solution {
    public int punishmentNumber(int n)
     {
        int ts=0;
        for(int i=1;i<=n;i++)
        {
            int sq=i*i;
            String sqstr=Integer.toString(sq);
            if(canp(sqstr,0,i))
            {
                ts+=sq;
            }
        }
        return ts;
    }
     private boolean canp(String str, int index, int target) {
        if (index == str.length()) {
            return target == 0;
        }

        int num = 0;
        for (int j = index; j < str.length(); j++) {
            num = num * 10 + (str.charAt(j) - '0'); 
            if (num > target) break; 
            if (canp(str, j + 1, target - num)) {
                return true;
            }
        }
        return false;
    }
}
