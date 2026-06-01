class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length -1;
        int max = 0;
        while(l<r)
        {
            int lh = height[l];
            int rh = height[r];
            int ch = lh<rh ? lh : rh; 
            int area = ch * (r-l);
            System.out.println(area);
            if(area>max)
            {
                max = area;
            }
            if(height[l] < height[r])
            {
                l++;
            }
            else if(height[l] > height[r])
            {
                r--;
            }
            else
            {
                if(height[l+1] > height[r-1])
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return max;
    }
}