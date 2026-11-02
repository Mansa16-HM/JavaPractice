public class SwalElementsClass {
    public void SwapElements(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1)
            return;
        int rightIndex = arr.length - 1;
        int leftIndex = 0;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        /*
         * if (leftIndex == rightIndex) {
         * System.out.println(arr[leftIndex]);
         * } else {
         * System.out.println(arr[rightIndex]);
         * }
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 12, 34, 67, 12, 90, 10,11 };
        SwalElementsClass obj = new SwalElementsClass();
        obj.SwapElements(nums);
    }
}
