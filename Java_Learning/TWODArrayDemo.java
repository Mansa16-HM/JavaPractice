public class TWODArrayDemo {
    public static void main(String[] args) {
        int[][] TwoDArray = new int[][] { { 1, 2, 3, 1 }, { 4, 5, 6, 1 }, { 7, 8, 9, 1 } };
        /*
         * for (int i = 0; i < TwoDArray.length; i++) {
         * for (int j = 0; j < TwoDArray[i].length; j++) {
         * System.out.print(TwoDArray[i][j] + " ");
         * }
         * System.out.println();
         * 
         * }
         */

        for (int x[] : TwoDArray) {
            for (int y : x) {

                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
