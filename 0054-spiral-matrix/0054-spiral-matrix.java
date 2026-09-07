import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        int startingRow = 0;
        int endingRow = m - 1; 
        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            
            // 1. Top row: Left to Right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // 2. Right column: Top to Bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // 3. Bottom row: Right to Left (Check if row still exists)
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) { 
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // 4. Left column: Bottom to Top (Check if col still exists)
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) { // Correction 2: row >= startingRow
                    result.add(matrix[row][startingCol]);
                }
                startingCol++; 
            }
        }

        return result;
    }
}