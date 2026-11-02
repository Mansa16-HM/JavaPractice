import java.util.*;

public class ArrayCondition {

    public static int[] ArrayNumberGreater(int[] arr) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 50 && arr[i] < 100)
                count++;
        int[] resultArray = new int[count];
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > 50 && arr[j] < 100) {
                // int index=0;
                resultArray[index] = arr[j];
                index++;
            }
        }
        return resultArray;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 10, 100, 50, 150, 250, 23, 56, 99, 68, 49 };
        ArrayCondition obj = new ArrayCondition();
        int[] result = obj.ArrayNumberGreater(arr);
        System.out.println(Arrays.toString(result));

    }

}
