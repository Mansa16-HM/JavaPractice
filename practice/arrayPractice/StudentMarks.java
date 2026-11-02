
import java.util.Scanner;

public class StudentMarks {
    public int GetPassedStudentsCount(int[] arr) {
        int count = 0;
        if (arr == null || arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 30)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println("enter the array elements:");
        Scanner S = new Scanner(System.in);
        int length = S.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        StudentMarks obj = new StudentMarks();
        int result = obj.GetPassedStudentsCount(arr);
        System.out.println(result);
        S.close();
    }
}
