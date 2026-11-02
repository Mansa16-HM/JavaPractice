public class EvenDigitCount {
    public static int EvenDigitCount(int[] arr) {
        int Count = 0;
        // int sum = 0;
        int isDigit = 0;
        if (arr == null || arr.length == 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];

            while (number > 0) {
                number = number % 10;

                isDigit++;
                number = number / 10;

            }

            if (isDigit % 2 == 0) {
                Count++;
            }
        }
        return Count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 345, 2, 6, 7896 };
        int result = EvenDigitCount(arr);
        System.out.println(result);
    }
}
