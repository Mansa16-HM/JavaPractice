public class MainArrayDemo {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 2, 3, 4 },
                { 4, 5, 6, 4 },
                { 7, 8, 9, 3 },
                { 1, 2, 3, 4 }
        };

        int[][] b = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 },
                { 1, 2, 3, 4 }
        };

        int[][] result = new int[a.length][b.length];

        // Matrix multiplication
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < result.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}