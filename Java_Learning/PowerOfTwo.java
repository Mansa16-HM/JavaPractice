import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter stop: ");
        int stop = sc.nextInt();

        long power = 1;

        for (int i = 1; i <= stop; i++) {
            power = power * 2;

            if (i >= start) {
                System.out.println("2 ^ " + i + " = " + power);
            }
        }
    }
}