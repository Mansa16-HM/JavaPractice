public class ArrayPractice {
    public void ArrayDemo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println(arr[i] + ">" + arr[j]);
                } else if (arr[i] < arr[j]) {
                    System.out.println(arr[i] + "<" + arr[j]);
                } else {
                    System.out.println(arr[i] + "==" + arr[j]);
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        ArrayPractice obj = new ArrayPractice();
        obj.ArrayDemo(arr);
    }
}
