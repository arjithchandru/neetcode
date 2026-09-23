class Solution {
    public boolean hasDuplicate(int[] nums) {

       Map<Integer, Long> count = Arrays.stream(nums)
       .boxed()
       .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

       List<Integer> result = count.entrySet()
       .stream()
       .filter(entry -> entry.getValue() >= 2)
       .collect(Collectors.mapping(Map.Entry::getKey, Collectors.toList()));

       return !result.isEmpty();
    }
}