public class EvenCountClass {
    public static int CountEvenNumbers(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Array is empty");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 43, 67, -9, 86, 56, 0, 0, -8, 778, 7, 9999 };
        int result = CountEvenNumbers(arr);
        System.out.println(result);

    }

}
