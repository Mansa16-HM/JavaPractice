public class myArray {
    int[] array;
    int length;
    int rightIndex;// pointing at empty box of the array

    public myArray() {
        length = 5;
        array = new int[length]; // [0][0][0][0] -->initial array
        rightIndex = 0;
    }

    // insert at end
    public void InsertAtEnd(int Value) {
        if (rightIndex == length) {
            System.out.println("Array is Full");
            return;
        }
        array[rightIndex] = Value;
        rightIndex++;
    }

    // insert at Start
    public void inserAtStart(int Value) {
        if (rightIndex == length) {
            System.out.println("Array is Full");
            return;
        }
        for (int i = rightIndex - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = Value;
        rightIndex++;

    }

    // shift and then insert
    public void insertAtPostision(int value, int pos) {
        if (rightIndex == length) {
            System.out.println("Array is Full");
            return;
        }
        if (pos < 0 || pos > rightIndex) {
            System.out.println("invalid position");
            return;
        }
        for (int i = rightIndex - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = value;
        rightIndex++;

    }

    // delete the array element in any index

    public void deleteAtAnyPosition(int pos) {
        if (rightIndex == 0) {
            System.out.println("array is empty");
            return;
        }
        if (pos < 0 || pos > rightIndex) {
            System.out.println("Invalid position");
        }
        for (int i = pos; i <= rightIndex; i++) {
            array[i] = array[i + 1];
            // System.out.println()
        }
        rightIndex--;
        array[rightIndex] = 0;

    }

    // print the array
    public void printElements() {

        System.out.println("index\tvalue");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }
        System.out.println(" ");
        System.out.println("Size of the array:" + rightIndex);

    }

    // to delelte the array elements from End
    public void deleteFromEnd() {
        if (rightIndex == 0) {
            System.out.println("array is empty");
            return;
        }
        array[rightIndex - 1] = 0;
        rightIndex--;
    }

    // Delete From Start
    public void deleteAtStart() {
        if (rightIndex == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < rightIndex - 1; i++) {
            array[i] = array[i + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;

    }
}