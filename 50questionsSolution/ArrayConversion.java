import java.util.Arrays;

public class ArrayConversion {
    public static int[] ArrayMethod(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[] {};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // int sum = 0;
            sum = sum + nums[i];

            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 1 };
        int[] result = ArrayMethod(arr);
        System.out.print(Arrays.toString(result));

    }

}
