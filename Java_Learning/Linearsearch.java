
import java.util.Scanner;

public class Linearsearch {
    public static void LinearSearch(int[] array, int key) {
        boolean found = false;
        if (array.length == 0) {
            System.out.println("array is Empty");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("element is at the index " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("elements is not in the array!");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the key!");
        int key = sc.nextInt();

        System.out.println("enter the length of the array that u wnats to create");
        int Length = sc.nextInt();

        int[] arr = new int[Length];

        System.out.println("Enter " + Length + " elements:");
        for (int i = 0; i < Length; i++) {
            arr[i] = sc.nextInt();
        }

        
        LinearSearch(arr, key);
    }

}