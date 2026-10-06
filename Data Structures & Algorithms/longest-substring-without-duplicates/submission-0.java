class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        int maxLen = 0;
        int size = s.length();

        Set<Character> seen = new HashSet<>();

        while(right < size){
            char c = s.charAt(right);

            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;

    }
}
