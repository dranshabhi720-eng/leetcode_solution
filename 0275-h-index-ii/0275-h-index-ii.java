class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = n - mid; // Number of papers with at least citations[mid] citations

            if (citations[mid] >= count) {
                // We found a valid h-index candidate, try searching left for a potentially larger h-index
                right = mid - 1;
            } else {
                // Not enough citations, search right
                left = mid + 1;
            }
        }

        return n - left;
    }
}
