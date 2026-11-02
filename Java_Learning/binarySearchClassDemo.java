public class binarySearchClassDemo {

    public static int binarySearch(int[] array, int target) {

        // case 1: array is null
        if (array == null) {
            return -1;
        }

        // case 2: array is empty
        if (array.length == 0) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {

            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (array[midIndex] == target) {
                return midIndex;
            }

            else if (array[midIndex] > target) {
                rightIndex = midIndex - 1;
            }

            else {
                leftIndex = midIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int target = 8;

        binarySearchClassDemo searchObj = new binarySearchClassDemo();

        int result = searchObj.binarySearch(array, target);

        System.out.println("Key index is " + result);
    }
}