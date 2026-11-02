import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 16 · Count the palindrome numbers
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return how many numbers are palindromes (read the same both ways, like 121).
 *
 * Sample input to the function: [121, 45, 7, 1331, 80]
 * Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countPalindromes(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q16_CountPalindromeNumbers.java then java
 * Q16_CountPalindromeNumbers
 * (or run it in one step with: java Q16_CountPalindromeNumbers.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q16_CountPalindromeNumbers {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countPalindromes(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            while (number > 0) {
                number = number / 10;
                int rem = number % 10;
                sum = sum + number * 10 + rem;
            }
            if (numbers[i] == sum)
                count++;
        }

        return count;
    }

    // ======================================================================
    // Test cases for countPalindromes: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countPalindromes(new int[] { 121, 45, 7, 1331, 80 }),
                3);
        run(2, "Null input",
                () -> countPalindromes((int[]) null),
                0);
        run(3, "Empty",
                () -> countPalindromes(new int[] {}),
                0);
        run(4, "Single digits, including 0",
                () -> countPalindromes(new int[] { 0, 5, 9 }),
                3);
        run(5, "Trailing zeros",
                () -> countPalindromes(new int[] { 10, 100, 120 }),
                0);
        run(6, "Negatives are not palindromes",
                () -> countPalindromes(new int[] { -121, -7, 121 }),
                1);
        run(7, "Two-digit numbers",
                () -> countPalindromes(new int[] { 11, 12, 22 }),
                2);
        run(8, "Even and odd digit counts",
                () -> countPalindromes(new int[] { 1221, 12321, 1231 }),
                2);
        run(9, "Duplicates",
                () -> countPalindromes(new int[] { 44, 44, 45 }),
                2);
        run(10, "No palindromes",
                () -> countPalindromes(new int[] { 12, 345, 6789 }),
                0);
        run(11, "Single number, not a palindrome",
                () -> countPalindromes(new int[] { 1000021 }),
                0);
        run(12, "Extreme values",
                () -> countPalindromes(new int[] { 2147447412, Integer.MAX_VALUE, Integer.MIN_VALUE }),
                1);

        printSummary();
    }

    // ======================================================================
    // Test harness: you do not need to change anything below this line.
    // ======================================================================

    private static int passed = 0;
    private static int total = 0;

    private static void run(int number, String category, Supplier<Object> call, Object expected) {
        total++;
        String label = "Test " + number + " (" + category + ")";
        try {
            Object returned = call.get();
            if (matches(expected, returned)) {
                passed++;
                System.out.println("PASS   " + label);
            } else {
                System.out.println("FAIL   " + label);
                System.out.println("         expected: " + show(expected));
                System.out.println("         returned: " + show(returned));
            }
        } catch (UnsupportedOperationException notWritten) {
            System.out.println("TODO   " + label + "  ->  write your code in the function first");
        } catch (Throwable error) {
            System.out.println("ERROR  " + label + "  ->  " + error);
        }
    }

    private static boolean matches(Object expected, Object returned) {
        if (expected instanceof Number && returned instanceof Number
                && !(expected instanceof Character) && !(returned instanceof Character)) {
            return Math.abs(((Number) expected).doubleValue() - ((Number) returned).doubleValue()) < 1e-6;
        }
        if (expected instanceof double[] && returned instanceof double[]) {
            double[] want = (double[]) expected;
            double[] got = (double[]) returned;
            if (want.length != got.length) {
                return false;
            }
            for (int index = 0; index < want.length; index++) {
                if (Math.abs(want[index] - got[index]) >= 1e-6) {
                    return false;
                }
            }
            return true;
        }
        return Objects.deepEquals(expected, returned);
    }

    private static String show(Object value) {
        if (value == null) {
            return "null";
        }

        if (value instanceof int[]) {
            return Arrays.toString((int[]) value);
        }
        if (value instanceof double[]) {
            return Arrays.toString((double[]) value);
        }
        if (value instanceof boolean[]) {
            return Arrays.toString((boolean[]) value);
        }
        if (value instanceof char[]) {
            StringBuilder text = new StringBuilder("[");
            char[] letters = (char[]) value;
            for (int index = 0; index < letters.length; index++) {
                text.append(index == 0 ? "" : ", ").append('\'').append(letters[index]).append('\'');
            }
            return text.append("]").toString();
        }
        if (value instanceof Object[]) {
            return Arrays.deepToString((Object[]) value);
        }
        if (value instanceof Character) {
            return "'" + value + "'";
        }
        return String.valueOf(value);
    }

    private static void printSummary() {
        System.out.println();
        System.out.println(passed + " / " + total + " test cases passed.");
        if (passed == total) {
            System.out.println("All test cases passed. Well done!");
        } else {
            System.out.println("Keep going: fix the failing cases, then run again.");
        }
    }
}
