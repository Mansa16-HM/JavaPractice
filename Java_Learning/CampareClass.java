import java.util.*;

public class CampareClass {
    public void isNumberInGivenArray(int[] arr, int num) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]) {
                System.out.println(num + ">" + arr[i]);
            } else if (num < arr[i]) {
                System.out.println(num + "<" + arr[i]);
            } else {
                System.out.println(num + "==" + arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int Number = sc.nextInt();
        System.out.println("enter the length of the array");
        int length = sc.nextInt();
        System.out.println("enter the array elements");
        int[] array = new int[length];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = sc.nextInt();
        }
        CampareClass Arr = new CampareClass();
        Arr.isNumberInGivenArray(array, Number);
        sc.close();

    }
}
