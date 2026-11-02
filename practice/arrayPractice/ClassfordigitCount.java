import java.util.Arrays;

public class ClassfordigitCount {
    public int[] getArrayElementSum(int[] arr) {

        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                int rem = num % 10;
                num = num / 10;
                int sum = 0;
                sum = sum + (num + rem);
                resultArray[i] = sum;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 123, 90, 0, 9 };
        ClassfordigitCount obj = new ClassfordigitCount();
        int[] resultArray = obj.getArrayElementSum(arr);
        System.out.println(Arrays.toString(resultArray));
    }
}
