import java.util.Arrays;

public class insersionSortClass {
    public int[] InsertionSortingMethod(int[] arr) {
        if (arr == null || arr.length == 0)
            return new int[] {};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // arr[j+1]
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 7, 6, 5, 4 };
        insersionSortClass obj = new insersionSortClass();
        int[] result = obj.InsertionSortingMethod(arr);
        System.out.println(Arrays.toString(result));

    }
}