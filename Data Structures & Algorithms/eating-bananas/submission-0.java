class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = piles.length;
        int rate = 0;
        int min = 1;
        int max = piles[0];
        int tot = 0;
        for(int i = 0; i<l; i++)
        {
            tot += piles[i];
            if(piles[i]>max)
            {
                max = piles[i];
            }
        }
        rate = max;
        while(min<=max)
        {
            int mid = (min + max)/2;
            long hours = 0;
            for(int pile: piles)
            {
                hours += (pile + mid -1 )/mid;
            }
            if(hours <= h)
            {
                rate = mid;
                max = mid-1;
            }
            else
            {
                min = mid + 1;
            }
        }
        return rate;
    }
}