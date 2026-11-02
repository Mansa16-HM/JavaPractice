public class MergeSortClass {
    public static void MergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        Merge(arr, low, high);
        Merge(arr, mid + 1, high);
        MergeSort(arr, low, mid, high);

    }

    public static void Merge(int[] arr, int low, int high, int mid) {
        int tempLength = (high - low + 1);
        int[] tempArray = new int[tempLength];
        int i = low;
        int j = mid + 1;
        int k = 0;// to access extra temp array
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tempArray[k] = arr[i];
                i++;
            } else {
                tempArray[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            tempArray[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            tempArray[k] = arr[j];
            j++;
            k++;

        }
        for (int i1 = low; i1 <= high; i1++) {
            k = 0;
            arr[i1] = tempArray[k];
            k++;

        }

    }

    public static void printMethod(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 0, 1, 5, 3, 6, 7, 9 };
        int low = arr[0];
        int high = arr[arr.length - 1];
        printMethod(arr);

    }
}
