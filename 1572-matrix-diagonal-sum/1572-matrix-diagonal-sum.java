class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // Loop chalakar dono diagonals ke elements ko add karenge
        for (int i = 0; i < n; i++) {
            // Primary diagonal: mat[i][i]
            sum += mat[i][i];

            // Secondary diagonal: mat[i][n - 1 - i]
            sum += mat[i][n - 1 - i];
        }

        // Agar matrix odd size ka hai, to center element double add hua hai
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}