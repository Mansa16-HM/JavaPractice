public class PracArray {
    int length;
    int rightIndex;
    int[] array;

    public PracArray() {
        length = 6;
        rightIndex = 0;
        array = new int[length];
    }

    public void insertAtEnd(int Value) {
        if (rightIndex == array.length - 1) {
            System.out.println("Array is full");
            return;
        }
        array[rightIndex] = Value;
        rightIndex++;
    }

    public void insertAtStart(int Value) {
        if (rightIndex == array.length) {
            System.out.println("Array is full");
            return;
        }
        for (int i = rightIndex - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = Value;
        rightIndex++;
    }

    public void insertAtAnyPos(int pos, int Value) {
        if (rightIndex == array.length) {
            System.out.println("Array is full");
            return;
        }

        if (pos < 0 || pos >= array.length) {
            System.out.println("Invalid position");
        }

        for (int i = rightIndex - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = Value;
        rightIndex++;
    }

    public void PrintElements() {
        System.out.println("index\tElement");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(i + "     " + array[i]);
        }

        System.out.println("Elements present in the Array " + rightIndex);
    }

    public void deleteFromEnd() {
        if (rightIndex == 0) {
            System.out.println("Array is empty");
            return;
        }
        rightIndex--;
        array[rightIndex] = 0;

    }

    public void deleteFromStart() {
        if (rightIndex == 0) {
            System.out.println("Array is empty");
        }
        for (int i = rightIndex - 1; i >= 0; i--) {
            array[i] = array[i + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;

    }

}
