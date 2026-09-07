class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Count frequencies of citations
        for (int c : citations) {
            if (c >= n) {
                count[n]++;
            } else {
                count[c]++;
            }
        }

        // Accumulate from right to left to find maximum h
        int totalPapers = 0;
        for (int i = n; i >= 0; i--) {
            totalPapers += count[i];
            if (totalPapers >= i) {
                return i;
            }
        }

        return 0;
    }
}