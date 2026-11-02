class ArrayProgram {

    static void LeftToRight(int[] array) {

        System.out.println();
        System.out.println("Printing the array elements From left to right");
        for (int i = 0; i < array.length; i++) {
            // System.out.println("Printing the array elements From left to right");
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" ");
        System.out.println();
    }

    static void RightToLeft(int[] arr) {

        System.out.println("Printing the array elements From right  to left");
        for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.println("Printing the array elements From right to left");
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" ");
    }

    static void printLeftAndRightUsingTwoPointer(int[] array) {
        System.out.println();
        System.out.println("Printing Left And Right Using Two Pointer ");
        int left = 0;
        int right = array.length - 1;

        // for(int i=0;i<=array.length;i++)
        while (left <= right) {
            System.out.print(array[left] + " ");
            // System.out.println();
            if (left != 0) {
                System.out.print(" -> ");
            }

            System.out.print(array[right] + " ");
            if (right != array.length) {
                System.out.print(" -> ");
            }
            left++;
            right--;
        }
    }

    static void printFromCenterTowardsEnd(int[] arr) {
        int left;
        int right;

        System.out.println();
        System.out.println("print From Center Towards End");

        if (arr.length % 2 == 0) // even
        {
            right = arr.length / 2;
            left = right - 1;
        } else // odd
        {
            right = arr.length / 2;
            left = right;
        }

        while (left >= 0 && right <= arr.length - 1) {
            // System.out.println(arr[left]+ " " +arr[right]);

            if (arr[right] == arr[left]) {
                System.out.print(arr[left] + "->");
            } else {
                System.out.print(arr[left] + " ->" + arr[right] + " ->");
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        LeftToRight(arr);
        RightToLeft(arr);
        printLeftAndRightUsingTwoPointer(arr);
        printFromCenterTowardsEnd(arr);
    }

}