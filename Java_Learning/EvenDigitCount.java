public class EvenDigitCount {
    public static int EvenDigitCount1(int[] arr) {
        int Count = 0;
        int sum = 0;
        if (arr == null && arr.length == 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            while (number > 0)
                number = number % 10;
            sum++;
        }
        if (sum % 2 == 0) {
            Count++;
        }
        return Count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 908, 7653, 98, };
        int result = EvenDigitCount1(arr);
        System.out.println(result);
    }
}

