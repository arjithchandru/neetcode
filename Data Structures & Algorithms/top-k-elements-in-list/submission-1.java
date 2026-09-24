class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted((b,a) -> a.getValue().compareTo(b.getValue()))
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();

        return result;
        
    }
}
