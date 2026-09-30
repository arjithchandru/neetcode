class Solution {
    public boolean isPalindrome(String s) {
        
        int right = s.length() - 1;
        int left = 0;
        char[] ch = s.toCharArray();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(ch[left])){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(ch[right])){
                right--;
            }

            if(Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right])){
                return false;
            }
            left++;
            right--;

        }

        return true;
    }
}
