public class pracProgram {
    public int findMax(int[] arr) {
        if (arr == null || arr.length < 2)
            return -1;
        int firstmax = arr[0];
        int secondmax = arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > firstmax) {
                secondmax = firstmax;
                firstmax = arr[i];
            }
        }
        return secondmax;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, -2, 11, 6, 34, 20, 19 };
        pracProgram obj = new pracProgram();
        int Max = obj.findMax(arr);
        System.out.println(Max);

    }
}