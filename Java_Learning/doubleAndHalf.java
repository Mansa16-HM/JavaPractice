import java.util.Arrays;

public class doubleAndHalf {
    public int[] DoublingAndHalvingTheArrayElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i] / 2;
            } else {
                result[i] = arr[i] * 2;
            }

        }
        return result;

    }

    public static void main(String args[]) {
        int[] arr = new int[] { 4, 7, 10, 3 };
        doubleAndHalf obj = new doubleAndHalf();
        int[] result = obj.DoublingAndHalvingTheArrayElements(arr);
        System.out.println(Arrays.toString(result));
    }

}
