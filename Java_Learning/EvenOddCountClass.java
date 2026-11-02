import java.util.Arrays;

public class EvenOddCountClass {
    public int[] EvenOddCount(int[] arr) {
        if (arr == null || arr.length == 0)
            return new int[] {};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return new int[] { evenCount, oddCount };
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 34, 89, 69, 50, 40, 23, 11, 13 };
        EvenOddCountClass obj = new EvenOddCountClass();
        int[] resultentArray = obj.EvenOddCount(nums);
        System.out.println(Arrays.toString(resultentArray));
    }

}
