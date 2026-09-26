class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        boolean hasZero = false;
        boolean hasMoreZero = false;
        for(int num : nums) {
            if(num == 0){
                if(hasZero){
                    hasMoreZero = true;
                }
                hasZero = true;
                continue;
            }
            total = total * num; 
        }

        System.out.println(total);

        if(hasMoreZero){
            for(int i = 0; i < nums.length; i++){
                nums[i] = 0;
            }
        } else if(hasZero){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    nums[i] = total;
                    continue;
                }
                nums[i] = 0;
            }
        } else{
            for(int i = 0;  i < nums.length; i++){
                int current = nums[i];
                nums[i] = total / current;
            }
        }

        return nums;
        
    }
}  
