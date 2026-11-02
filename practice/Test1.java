import java.util.Arrays;

class Node {
    int data;
    Node(int data) { this.data = data; }
}

public class Test1 {
    static void modify(Node n) {
        n.data = 10;
        n = new Node(20);
        n.data = 30;
    }

    static void reset(int[] arr) {
        arr = new int[]{7, 8, 9};
    }

    static void doubleIt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        int[] nums = {1, 2, 3};

        modify(head);
        reset(nums);
        doubleIt(nums);

        System.out.println(head.data);
        System.out.println(Arrays.toString(nums));
    }
}