class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int tot = len1+len2;
        int half = (tot)/2;
        int l = 0;
        int r = len1;
        while(l<=r)
        {    
            int mid1 = l+ (r-l)/2;
            int mid2 =  half-mid1;
            int min1 = (mid1 == 0)? Integer.MIN_VALUE: nums1[mid1-1];
            int min2 = (mid2 == 0) ? Integer.MIN_VALUE: nums2[mid2-1];
            int max1 = (mid1 == len1) ? Integer.MAX_VALUE : nums1[mid1];
            int max2 = (mid2 ==  len2) ? Integer.MAX_VALUE : nums2[mid2];
            if(max2>=min1 && max1>=min2)
            {
                if(tot%2 == 0)
                {
                    double left = Math.max(min1, min2);
                    double right = Math.min(max1, max2);
                    return (left+right)/2.0;
                }
                else
                {
                    return Math.min(max1, max2);
                }
            }
            if(min1 > max2)
            {
                r = mid1-1;
            }
            else
            {
                l = mid1+1;
            }
        }
        return -1;
    }
}