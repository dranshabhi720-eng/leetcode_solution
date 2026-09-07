class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length; // Matrix ki dimension lete haui

        //  Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < N; i++) {
            int startCol = 0;
            int endCol = N - 1;

            while (startCol < endCol) {
                int temp = matrix[i][startCol];
                matrix[i][startCol] = matrix[i][endCol];
                matrix[i][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }
}