class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxCount = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int curr = num;
                int count = 0;
                while (numSet.contains(curr)) {
                    count++;
                    curr++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
