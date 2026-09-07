class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        //  Duplicate number dhoondna
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]); // Number ki positive value le rahe hain
            int index = val - 1;         // 1-based index ko 0-based index banaya

            if (nums[index] < 0) {
                // Agar ye pehle se negative hai, matlab ye number dobara aaya hai
                duplicate = val;
            } else {
                // Pehli baar dekha hai, toh is index waale number ko negative mark kar do
                nums[index] = -nums[index];
            }
        }

        // Step 2: Missing number dhoondna
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // Jo index positive reh gaya, wahi number missing hai
                missing = i + 1;
            }
        }

        // Final result return kar rahe hain
        return new int[]{duplicate, missing};
    }
}