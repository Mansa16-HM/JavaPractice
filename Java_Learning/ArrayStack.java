public class ArrayStack {
    int size;
    int[] array;
    int Max;
    int top;

    public ArrayStack() {
        size = 6;
        array = new int[size];
        top = -1;
        Max = size - 1;

    }

    public void push(int data) {
        if (top == Max) {
            System.out.println("Stack is Full");
        }
        top++;
        array[top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int Value = array[top];
        top--;
        return Value;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        int value = array[top];
        return value;

    }

    public void display() {
        for (int i = 0; i <= Max; i++) {
            System.out.println(array[i]);
        }
    }
}
