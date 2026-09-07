class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return early if no carry propagates
            }
            // If the digit is 9, it becomes 0
            digits[i] = 0;
        }
        
        // If all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // Default array values in Java are 0, so result[1...n] are already 0
        
        return result;
    }
}
