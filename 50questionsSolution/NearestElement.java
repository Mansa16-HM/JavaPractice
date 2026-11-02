import java.util.Scanner;

public class NearestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find the nearest element for: ");
        int target = sc.nextInt();

        // Start with the first element as the nearest
        int nearest = arr[0];
        int minDiff = arr[0] - target;
        if (minDiff < 0) {
            minDiff = -minDiff; // manual absolute value
        }

        for (int i = 1; i < n; i++) {
            int diff = arr[i] - target;
            if (diff < 0) {
                diff = -diff; // manual absolute value
            }

            if (diff < minDiff) {
                minDiff = diff;
                nearest = arr[i];
            }
        }

        System.out.println("Nearest element to " + target + " is: " + nearest);

        sc.close();
    }
}