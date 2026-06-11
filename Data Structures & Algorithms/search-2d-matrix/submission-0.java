class Solution {
    public int length;
    public int height;
    public int geth(int i)
    {
        return i/this.length;
    }

    public int getl(int i)
    {
        return i%this.length;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        this.height = matrix.length;
        this.length = matrix[0].length;
        System.out.println(height+" " + length);
        int l = 0;
        int r = height*length - 1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            int ch = geth(mid);
            int cl = getl(mid);
            if(matrix[ch][cl]==target)
            {
                return true;
            }
            else if(matrix[ch][cl] < target)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }        
        return false;
    }
}