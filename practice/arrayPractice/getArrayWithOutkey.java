import java.util.*;

public class getArrayWithOutkey {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int k = removeElement(arr, 2);
        System.out.println("Count: " + k);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));
    }
}     
