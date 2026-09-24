class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            int reminder = target - nums[i];

            if(cache.containsKey(reminder)){
                arr[0] = cache.get(reminder);
                arr[1] = i;
                break;
                
            } else {
                cache.put(nums[i], i);
            }
        }

        return arr;

    }
}
