class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l +(r - l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;

        int res = binarySearch(nums, target, 0, pivot - 1);

        if (res != -1) {
            return res;
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
           return binarySearch(nums, target, left, mid - 1);
        } else {
             return binarySearch(nums, target, mid + 1, right);
        }
    }
}
