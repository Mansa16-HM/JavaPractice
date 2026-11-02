import java.util.Arrays;

public class Array3 {
    int sum = 0;

    public int[] threeArray(int[] arr1, int[] arr2, int[] arr3) {
        int[] resultArray = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        resultArray[0] = sum;
        sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        resultArray[1] = sum;
        sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum = sum + arr3[i];
        }
        resultArray[2] = sum;
        sum = 0;
        return resultArray;
    }

    public static void main(String args[]) {
        int[] arr1 = new int[] { 12, 89, 10 };
        int[] arr2 = new int[] { 1, 2, 3 };
        int[] arr3 = new int[] { 10, 20, 30 };
        Array3 obj = new Array3();
        int[] result = obj.threeArray(arr1, arr2, arr3);
        System.out.println(Arrays.toString(result));

    }
}
