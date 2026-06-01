class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length -1;
        int total = 0;
        int lmax = 0;
        int rmax = 0;
        while(l<r)
        {
            int lh = height[l];
            int rh = height[r];
            if(lh<rh)
            {
                if(lh<lmax)
                {
                    total+= lmax-lh;
                }
                else
                {
                    lmax = lh;
                }
                l++;
            }
            else
            {
                if (rh<rmax)
                {
                    total += rmax-rh;
                }
                else
                {
                    rmax = rh;
                }
                r--;
            }
        }
        return total;
    }
}