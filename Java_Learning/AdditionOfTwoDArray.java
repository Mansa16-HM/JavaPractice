public class AdditionOfTwoDArray {
    public static void main(String[] args) {
        int[][] TwoDArray1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] TwoDArray2 = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int[][] TwoDArray2 = new int[][] { { 1, 2, 3 }, { 4, 5, 4 } };
        int[][] ResultantDArray = new int[3][3];
        for (int i = 0; i < TwoDArray1.length; i++) {
            for (int j = 0; j < TwoDArray2.length; j++) {
                ResultantDArray[i][j] = TwoDArray1[i][j] + TwoDArray2[i][j];

            }
        }
        System.out.println();
        for (int i1 = 0; i1 < TwoDArray1.length; i1++) {
            for (int j1 = 0; j1 < TwoDArray2.length; j1++) {
                System.out.print(ResultantDArray[i1][j1] + " ");
            }
            System.out.println();
        }

    }
}
