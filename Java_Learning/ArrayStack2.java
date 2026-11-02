public class ArrayStack2 {

    int size;
    int[] array;
    int Max;
    int top;

    public ArrayStack2() {
        size = 6;
        array = new int[size];
        top = -1;
        Max = size - 1;
    }

    public void push(int data) {

        if (top == Max) {
            System.out.println("Stack is Full");
            return;
        }

        top++;
        array[top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = array[top];
        top--;

        return value;
    }

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = array[top];
        return value;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }
}