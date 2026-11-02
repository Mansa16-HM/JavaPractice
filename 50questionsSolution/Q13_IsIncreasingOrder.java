import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 13 · Check whether the numbers are in increasing order
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return true if the numbers are in increasing order, otherwise false.
 *
 * Sample input to the function: [2, 5, 9, 14]
 * Sample return from the function: true
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside isIncreasingOrder(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q13_IsIncreasingOrder.java then java
 * Q13_IsIncreasingOrder
 * (or run it in one step with: java Q13_IsIncreasingOrder.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q13_IsIncreasingOrder {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static boolean isIncreasingOrder(int[] numbers) {
        if (numbers == null)
            return false;
        if (numbers.length == 0 || numbers.length == 1)
            return true;
        boolean isIncrease = false;

        int firstIndex = 0;
        for (int index = 1; index < numbers.length; index++) {
            while (firstIndex < numbers.length) {
                if (numbers[firstIndex] < numbers[index]) {
                    isIncrease = true;
                    firstIndex++;
                }
            }

        }

        if (isIncrease) {
            return true;
        } else {
            return false;
        }

    }

    // ======================================================================
    // Test cases for isIncreasingOrder: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {

        run(1, "Sample from the question",
                () -> isIncreasingOrder(new int[] { 2, 5, 9, 14 }),
                true);
        run(2, "Null input",
                () -> isIncreasingOrder((int[]) null),
                false);
        run(3, "Empty",
                () -> isIncreasingOrder(new int[] {}),
                true);
        run(4, "Single number",
                () -> isIncreasingOrder(new int[] { 7 }),
                true);
        run(5, "Two numbers, increasing",
                () -> isIncreasingOrder(new int[] { 3, 8 }),
                true);
        run(6, "Two equal numbers",
                () -> isIncreasingOrder(new int[] { 4, 4 }),
                false);
        run(7, "Decreasing",
                () -> isIncreasingOrder(new int[] { 9, 5, 1 }),
                false);

        run(8, "Drop at the end",
                () -> isIncreasingOrder(new int[] { 1, 2, 3, 2 }),
                false);

        run(9, "Drop at the start",
                () -> isIncreasingOrder(new int[] { 5, 1, 2, 3 }),
                false);
        run(10, "Drop in the middle",
                () -> isIncreasingOrder(new int[] { 1, 5, 2, 9 }),
                false);
        run(11, "Equal neighbours in the middle",
                () -> isIncreasingOrder(new int[] { 1, 3, 3, 7 }),
                false);
        run(12, "Negatives and zero",
                () -> isIncreasingOrder(new int[] { -9, -4, 0, 3 }),
                true);
        run(13, "Extreme values, increasing",
                () -> isIncreasingOrder(new int[] { Integer.MIN_VALUE, 0, Integer.MAX_VALUE
                }),
                true);
        run(14, "Extreme values, decreasing",
                () -> isIncreasingOrder(new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE }),
                false);

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
