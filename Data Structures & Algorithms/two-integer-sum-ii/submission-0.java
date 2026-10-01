class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> balance = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < numbers.length; i++){
            int bal = target -  numbers[i];

            if(balance.containsKey(bal)){
                result[0] = balance.get(bal);
                result[1] = i +  1;
                return result;
            }

            balance.put(numbers[i], i + 1);
        }

        return result;
        
    }
}
