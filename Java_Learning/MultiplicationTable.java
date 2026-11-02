import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}