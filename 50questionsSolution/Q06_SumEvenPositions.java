import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 06 · Sum of numbers at even positions
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return the sum of the numbers at positions 0, 2, 4 and so on.
 *
 * Sample input to the function: [10, 3, 20, 7, 30]
 * Sample return from the function: 60
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside sumEvenPositions(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q06_SumEvenPositions.java then java
 * Q06_SumEvenPositions
 * (or run it in one step with: java Q06_SumEvenPositions.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q06_SumEvenPositions {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static long sumEvenPositions(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0l;
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    // ======================================================================
    // Test cases for sumEvenPositions: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> sumEvenPositions(new int[] { 10, 3, 20, 7, 30 }),
                60L);
        run(2, "Null input",
                () -> sumEvenPositions((int[]) null),
                0L);
        run(3, "Empty",
                () -> sumEvenPositions(new int[] {}),
                0L);
        run(4, "Single number",
                () -> sumEvenPositions(new int[] { 8 }),
                8L);
        run(5, "Two numbers",
                () -> sumEvenPositions(new int[] { 4, 9 }),
                4L);
        run(6, "Odd length",
                () -> sumEvenPositions(new int[] { 1, 2, 3 }),
                4L);
        run(7, "Even length",
                () -> sumEvenPositions(new int[] { 1, 2, 3, 4 }),
                4L);
        run(8, "Index, not value, decides",
                () -> sumEvenPositions(new int[] { 1, 1000, 1 }),
                2L);
        run(9, "Only negatives",
                () -> sumEvenPositions(new int[] { -5, -100, -5 }),
                -10L);
        run(10, "Zeros at even positions",
                () -> sumEvenPositions(new int[] { 0, 9, 0, 9 }),
                0L);
        run(11, "All equal",
                () -> sumEvenPositions(new int[] { 2, 2, 2, 2, 2 }),
                6L);
        run(12, "Sum overflows an int",
                () -> sumEvenPositions(new int[] { Integer.MAX_VALUE, 0, Integer.MAX_VALUE }),
                4294967294L);

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
