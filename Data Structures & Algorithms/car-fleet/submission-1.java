class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        double[] timeAtPos = new double[target];
        
        for (int i = 0; i < position.length; i++) {
            timeAtPos[position[i]] = (double) (target - position[i]) / speed[i];
        }
        
        int fleets = 0;
        double maxTime = 0.0; 
        
        
        for (int i = target - 1; i >= 0; i--) {
            double currTime = timeAtPos[i];
            if (currTime > maxTime) {
                maxTime = currTime;
                fleets++;
            }
        }
        
        return fleets;
    }
}