class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int counter = 1;
            for(int j = i + 1; j < n; j++){ 
                if(temperatures[i] < temperatures[j]){
                    result[i] = counter;
                    break;
                }
                counter++;
            }

        }

        return result;
        
    }
}
