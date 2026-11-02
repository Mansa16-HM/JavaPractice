
public class TwoDArrayPractice {

    public static int[][] GetArrayElements(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return result;
    }

    public static void getOnlyOneRowInArray(int[][] arr, int rowNum) {
        // null
        if (arr.length == 0)
            return;
        // check for range 0 to length-1;
        // early exit
        if (rowNum <= 0 || rowNum > arr.length)
            return;
        // int[][] result = new int[rowNum][rowNum];
        // for (int row = 0; row < arr.length; row++) {
        for (int column = 0; column < arr[rowNum - 1].length; column++) {
            // result = new int[arr.length][arr[row].length];
            System.out.print(arr[rowNum - 1][column]);
            System.out.print(" ");
        }
    }

    public static void getOnlyOneColumnInTwoDArray(int[][] Data, int columnNum) {
        if (columnNum == 0)
            return;
        if (columnNum <= 0 || columnNum > Data.length)
            return;
        for (int row = 0; row < Data[columnNum - 1].length; row++) {
            System.out.print(Data[row][columnNum - 1]);
            System.out.print(" ");
        }
    }
    //

    public static void getColumn(int[][] arr, int columnNum) {
        if (arr == null)
            return;
        // for (int row = 0; row < arr.length; row++) {
        for (int row = 0; row < arr.length; row++) {
            if (arr[row].length <= columnNum - 1) {
                System.out.print(arr[row][columnNum]);

            }
            // System.out.print(arr[row][columnNum]);
            System.out.print(" ");
        }
    }

    public static void getEveryelementinLastPositionOfTwoDArrays(int[][] arr) {
        if (arr == null)
            return;

        // for (int row = 0; row < arr.length; row++) {
        for (int row = 0; row < arr.length; row++) {
            int columnLength = arr[row].length;
            System.out.print(arr[row][columnLength - 1]);
            System.out.print(" ");

        }
    }

    // method to print the right and left digonal elements in the array
    public static void getLeftDigonalElementMethod(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
    }

    public static void getRightDigonalElementMethod(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println();
        }
    }

    // function for to get the maxinum elements in the array
    public static int getMaxElements(int[][] arr) {
        int Max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > Max)
                    Max = arr[i][j];
            }
        }
        return Max;
    }
    // get the last elements of every element in the TWO D array
    // public static void get

    public static void main(String[] args) {
        int[][] DemoArray = new int[][] {
                { 11, 12, 13, 14, 15 },
                { 21, 22, 23, 24, 25 },
                { 31, 32, 33, 34, 35 },
                { 41, 42, 43, 44, 45 },
                { 51, 52, 53, 54, 55 } };
        // int[][] result = GetArrayElements(DemoArray);
        // System.out.println(Arrays.toString(result));
        // int whichRow = 1;
        // getOnlyOneRowInArray(DemoArray, whichRow);
        // System.out.println(Arrays.toString(Getresult));

        // int WhichColumn = 4;
        // getColumn(DemoArray, WhichColumn);

        // int result = getMaxElements(DemoArray);
        // System.out.println(result);

        // getEveryelementinLastPositionOfTwoDArrays(DemoArray);

        getLeftDigonalElementMethod(DemoArray);
        getRightDigonalElementMethod(DemoArray);
    }
}
