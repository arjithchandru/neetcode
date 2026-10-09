class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int[] target = new int[128];
        int left = 0;
        int formed = 0;
        int required = 0;

        for (char c : t.toCharArray()) {
            if (target[c] == 0) {
                required++;
            }
            target[c]++;
        }

        int[] window = new int[128];
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            window[c]++;

            if(target[c] > 0 && window[c] == target[c]){
                formed++;
            }

            while(formed == required){
                int len = i - left + 1;
                
                if(len < minLen){
                    minStart = left;
                    minLen = len;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if(target[leftChar] > 0 && window[leftChar] < target[leftChar]){
                    formed--;
                }
                left++;

            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
