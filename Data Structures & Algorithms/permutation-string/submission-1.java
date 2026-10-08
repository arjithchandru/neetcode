class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] original = s1.toCharArray();
        Arrays.sort(original);
        
        int l = 0;
        int r = s1.length() - 1;

        while(r < s2.length()){
            String temp = s2.substring(l, r + 1);
            System.out.println(temp);
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            if(Arrays.equals(original, arr)){
                return true;
            }
        l++;
        r++;
        }
        return false;
        
    }
}
