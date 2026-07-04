public class DiagonalSum {

    public static void sumOfDiagonal(int matrix[][]) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == j) {
                    count += matrix[i][j];
                    System.out.println(count);
                }

                if (i + j == n) {
                    count += matrix[i][j];
                    System.out.println(count);
                }

            }
        }

        System.out.println("Total Count Is : " + count);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        sumOfDiagonal(matrix);
    }
}
