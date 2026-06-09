class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        int datum[][] = new int[length][2];
        for(int i = 0; i<length; i++)
        {
            datum[i][0] = position[i];
            datum[i][1] = speed[i];
        }
        Arrays.sort(datum, (a, b) -> Integer.compare(b[0], a[0]));
        double stack[] = new double[length];
        int top = -1;
        for(int i = 0; i<length; i++)
        {
            double currtime = (double)(target - datum[i][0])/datum[i][1];
            if(top == -1)
            {
                stack[++top] = currtime;
            }
            else
            {
            if(currtime > stack[top])
            {
                stack[++top] = currtime;
            }}
        }
        return top +1;
    }
}