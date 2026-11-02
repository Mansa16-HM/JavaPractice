import java.util.*;

public class bubbleSort {
    public int[] bubbleSortMethod(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return new int[] {};
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public void PrintList(int[] arr) {
        for (int x : arr) {

            System.out.print(x + " ");
        }

    }

    public static void main(String args[]) {
        int[] arr = new int[] { -9, -89, 34, 21, 11, 1 };
        bubbleSort obj = new bubbleSort();
        // int[] resultArray = obj.bubbleSortMethod(arr);

        // System.out.println(Arrays.toString(resultArray));

        System.out.println("Before Sorting the array ");
        obj.PrintList(arr);
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("After Sorting the array ");
        obj.bubbleSortMethod(arr);
        obj.PrintList(arr);

    }
}
