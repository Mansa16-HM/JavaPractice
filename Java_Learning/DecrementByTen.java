import java.util.Scanner;

public class DecrementByTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter stop: ");
        int stop = sc.nextInt();

        System.out.println("Using For Loop");

        for (int i = start; i >= stop; i = i - 10) {
            System.out.println(i);
        }

        System.out.println("Using While Loop");

        int i = start;

        while (i >= stop) {
            System.out.println(i);
            i = i - 10;
        }

        System.out.println("Using Do-While Loop");

        i = start;

        do {
            System.out.println(i);
            i = i - 10;
        } while (i >= stop);
    }
}