class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1 Right side se pehla decreasing element (pivot) dhoondnge
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2 Agar pivot mil gaya
        if (i >= 0) {
            int j = n - 1;
            // Right side se nums[i] se bada pehla element dhoondnge
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap karo
            swap(nums, i, j);
        }

        // Step 3 i + 1 se leke end tak subarray ko reverse karemge 
        reverse(nums, i + 1, n - 1);
    }

    // Helper method to swap elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}