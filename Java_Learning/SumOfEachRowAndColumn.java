public class SumOfEachRowAndColumn {
    public static int[] getArrayCount(int[][] arr1) {
        int[][] rowSumArray =new int[][]{};
        // int columnSum=0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                rowSum += arr1[i][j];
            }
        }
        return rowSum;
    }

    public static void main(String[] args) {
        int[][] Array1;
        Array1=new int[3][];
        Array1[0]=new int[3];
        Array1[1]=new int[4];
        Array1[2]=new int[2];
        // int[][] Array2 = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int[][] result = getArrayCount(Array1);
        System.out.println(result);

    }
}
