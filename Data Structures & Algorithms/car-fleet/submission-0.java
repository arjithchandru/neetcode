class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] t = new double[target];

        for(int i = 0; i < position.length;i++){
            t[position[i]] = (double) (target - position[i]) / speed[i];
        }
        
        int fleet = 0;
        double maxTime = 0.0;

        for(int i = target - 1; i >= 0; i--){
            if(t[i] > 0){
                if(t[i] > maxTime){
                    fleet++;
                    maxTime = t[i];
                }
            }
        }

        return fleet;
        
    }
}
