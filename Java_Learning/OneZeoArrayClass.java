public class OneZeoArrayClass {
    public static void changeArrayElements(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                Arr[i] = 0;
            } else {
                Arr[i] = 1;
            }
        }
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 12, 78, 90, 33, 67, 87, 9, 11, 45 };
        changeArrayElements(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
