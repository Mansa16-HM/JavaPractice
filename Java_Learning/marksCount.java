public class marksCount {
    public static int MarksCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]) {
        int[] arr = new int[] { 12, 67, 98, 83, 10, 20, 30 };
        marksCount obj = new marksCount();
        int result = obj.MarksCount(arr);
        System.out.println(result);

    }
}
