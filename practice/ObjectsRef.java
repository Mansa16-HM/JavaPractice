public class ObjectsRef {
    public static void modify(int[] arr) {
        arr[2] = 201;
        arr[0] = 100;
        arr = new int[] { 9, 9, 9 };
        arr[1] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        modify(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
    }
}