public class QuickSort {
    public static void quickSortMethod(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j > low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];// to swap the unorder elements in the array
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];// to swap the element with the pivot;
        arr[low] = arr[j];
        arr[j] = temp;
        quickSortMethod(arr, low, j - 1);
        quickSortMethod(arr, j + 1, high);
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 50, 15, 80, 25, 60, 10, 90, 40, 70, 30 };
        quickSortMethod(arr, 0, arr.length - 1);
        PrintArray(arr);
    }
}
