class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int length = weights.length;
        int sum = 0;
        int max = 0;
        
        for(int weight: weights) {
            sum += weight;
            if(weight > max) {
                max = weight;
            }
        } 
        
        int l = max;
        int r = sum;
        
        while (l <= r) {
            int mid = l + (r - l) / 2; 
            
            int daysNeeded = 1;
            int currentLoad = 0;
            
            for (int i = 0; i < length; i++) {
                if (currentLoad + weights[i] > mid) {
                    daysNeeded++;
                    currentLoad = weights[i]; 
                } else {
                    currentLoad += weights[i]; 
                }
            }
            
            if (daysNeeded <= days) {
                r = mid - 1; 
            } else {
                l = mid + 1;
            }
        } 
        
        return l;
    }
}