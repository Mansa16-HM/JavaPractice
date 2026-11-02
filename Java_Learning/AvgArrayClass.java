public class AvgArrayClass {
    public double avgOftheArrayElements(int[] arr) {
        if (arr == null && arr.length == 0)
            return -1;
        int Sum = 0;
        double Avg;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        Avg = Sum / arr.length;
        return Avg;

    }

    public static void main(String args[]) {
        int[] array = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
        AvgArrayClass AvgObj = new AvgArrayClass();
        double Avg = AvgObj.avgOftheArrayElements(array);
        System.out.println(Avg);
    }

}
