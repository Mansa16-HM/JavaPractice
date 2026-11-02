import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 14 · Sum of the first and the last number
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return the sum of the first and the last number.
 *
 * Sample input to the function: [7, 3, 9, 4]
 * Sample return from the function: 11
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside sumFirstAndLast(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q14_SumFirstAndLast.java then java
 * Q14_SumFirstAndLast
 * (or run it in one step with: java Q14_SumFirstAndLast.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q14_SumFirstAndLast {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static Long sumFirstAndLast(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return null;
        long sumFirstAndLast = 0l;
        long first = numbers[0];
        long last = numbers[numbers.length - 1];
        sumFirstAndLast = first + last;
        return sumFirstAndLast;
    }

    // ======================================================================
    // Test cases for sumFirstAndLast: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> sumFirstAndLast(new int[] { 7, 3, 9, 4 }),
                11L);
        run(2, "Null input",
                () -> sumFirstAndLast((int[]) null),
                null);
        run(3, "Empty",
                () -> sumFirstAndLast(new int[] {}),
                null);
        run(4, "Single number (first is also last)",
                () -> sumFirstAndLast(new int[] { 5 }),
                10L);
        run(5, "Two numbers",
                () -> sumFirstAndLast(new int[] { 2, 9 }),
                11L);
        run(6, "Big middle numbers are ignored",
                () -> sumFirstAndLast(new int[] { 1, 100, 200, 2 }),
                3L);
        run(7, "All equal",
                () -> sumFirstAndLast(new int[] { 6, 6, 6 }),
                12L);
        run(8, "Only negatives at the ends",
                () -> sumFirstAndLast(new int[] { -4, 10, -6 }),
                -10L);
        run(9, "Ends cancel out",
                () -> sumFirstAndLast(new int[] { -7, 3, 7 }),
                0L);
        run(10, "Zeros at both ends",
                () -> sumFirstAndLast(new int[] { 0, 8, 0 }),
                0L);
        run(11, "Extreme: MAX + MAX",
                () -> sumFirstAndLast(new int[] { Integer.MAX_VALUE, 0, Integer.MAX_VALUE }),
                4294967294L);
        run(12, "Extreme: MIN + MIN",
                () -> sumFirstAndLast(new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE }),
                -4294967296L);

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
