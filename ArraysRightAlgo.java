
public class ArraysRightAlgo {
    public static int evenCount(int[] arr) {
        int EvenCount = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            }
        }

        return EvenCount;

    }

    public static int firstNegativeIndex(int[] arr) {
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int firstPositiveIndex(int[] arr, int key) {
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int OccuranceIndex(int[] arr, int key) {
        int index = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == key) {
                index = i;
            }
        }
        return index;

    }

    public static int[] ArrayMethod(int[] arr, int key) {
        int[] array = new int[] {};
        int index = 0;
        for (int i = arr.length - 1; i < 0; i--) {
            if (arr[i] >= key)
                array[index] = arr[i];
            index++;
        }
        return array;
    }

    public int[] revArray(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int reverse = 0;
            int n = arr[i];
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }
            array[i] = reverse;
        }

        return array;
    }

    public static int[] ZeroIntoFrontOfArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int index = 0;

        // First, copy all zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr2[index] = 0;
                index++;
            }
        }

        // Then, copy all nonzero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[index] = arr[i];
                index++;
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter the array size");
         * int size = sc.nextInt();
         * int[] arr = new int[size];
         * System.out.print("enter the array elements!");
         * for (int i = 0; i < size - 1; i++) {
         * arr[i] = sc.nextInt();
         * }
         */
        /*
         * int result = evenCount(arr);
         * System.out.println(result);
         */
        /*
         * int[] arr = new int[] { 9, 8, 87, 9, -1, 7, 10 };
         * int result = firstNegativeIndex(arr);
         * System.out.println(result);
         */
        /*
         * int[] arr = new int[] { 9, -9, 86, 54, 90 };
         * int result = firstPositiveIndex(arr);
         * System.out.println(result);
         */
        /*
         * int[] arr = new int[] { 29, 12, 11, 11 };
         * int result = OccuranceIndex(arr, 11);
         * System.out.println(result);
         */

        /*
         * int[] arr = new int[] { 29, 1, 11, 11 };
         * int[] result = ArrayMethod(arr, 10);
         * System.out.println(Arrays.toString(result));
         */
        /*
         * ArraysRightAlgo obj = new ArraysRightAlgo();
         * int[] arr = new int[] { 29, 1, 101, 11, 1234 };
         * int[] result = obj.revArray(arr);
         * System.out.println(Arrays.toString(result));
         */

       /*  int[] arr = new int[] { 78, 98, 00, 0, 12, 1 };
        int[] result = ZeroIntoFrontOfArray(arr);
        System.out.println(Arrays.toString(result)); */

        
    }
}
