public class RecursionPrograms {

    // 1. Factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1; // base case
        return n * factorial(n - 1); // recursive case
    }

    // 2. Fibonacci number at position n (0, 1, 1, 2, 3, 5, ...)
    static int fibonacci(int n) {
        if (n <= 1)
            return n; // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 3. Sum of first n natural numbers
    static int sumOfN(int n) {
        if (n == 0)
            return 0; // base case
        return n + sumOfN(n - 1);
    }

    // 4. Reverse a string
    static String reverse(String str) {
        if (str.isEmpty())
            return str; // base case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    // 5. Power: base raised to exp
    static int power(int base, int exp) {
        if (exp == 0)
            return 1; // base case
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        // System.out.println("Factorial of 6: " + factorial(5)); // 120
        // System.out.println("Fibonacci(7): " + fibonacci(7)); // 13
        System.out.println("Sum of first 10: " + sumOfN(10)); // 55
        // System.out.println("Reverse of 'hello': " + reverse("hello")); // olleh
        // System.out.println("2 power 5: " + power(2, 5)); // 32
    }
}