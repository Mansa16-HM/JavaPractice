import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 04 · Largest minus smallest
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return the difference between the largest and the smallest number.
 *
 * Sample input to the function: [14, 3, 27, 9]
 * Sample return from the function: 24
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside findLargestMinusSmallest(...) below. Do not change
 * its signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q04_LargestMinusSmallest.java then java
 * Q04_LargestMinusSmallest
 * (or run it in one step with: java Q04_LargestMinusSmallest.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q04_LargestMinusSmallest {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static Long findLargestMinusSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return null;
        /*
         * if (numbers.length == 1)
         * return 0l;
         */
        int MAX_VALUE = numbers[0];
        int MIN_VALUE = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < MIN_VALUE) {
                MIN_VALUE = numbers[i];
            }
            if (numbers[i] > MAX_VALUE) {
                MAX_VALUE = numbers[i];
            }
        }
        long LargeMinusSmall = (long) MAX_VALUE - (long) MIN_VALUE;
        return LargeMinusSmall;
    }

    // ======================================================================
    // Test cases for findLargestMinusSmallest: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findLargestMinusSmallest(new int[] { 14, 3, 27, 9 }),
                24L);
        run(2, "Null input",
                () -> findLargestMinusSmallest((int[]) null),
                null);
        run(3, "Empty",
                () -> findLargestMinusSmallest(new int[] {}),
                null);
        run(4, "Single number",
                () -> findLargestMinusSmallest(new int[] { 42 }),
                0L);
        run(5, "Two numbers",
                () -> findLargestMinusSmallest(new int[] { 9, 5 }),
                4L);
        run(6, "All equal",
                () -> findLargestMinusSmallest(new int[] { 7, 7, 7 }),
                0L);
        run(7, "Only negatives",
                () -> findLargestMinusSmallest(new int[] { -4, -10, -1 }),
                9L);
        run(8, "Only positives, none near 0",
                () -> findLargestMinusSmallest(new int[] { 50, 80, 60 }),
                30L);
        run(9, "Sorted ascending",
                () -> findLargestMinusSmallest(new int[] { 1, 2, 3, 10 }),
                9L);
        run(10, "Sorted descending",
                () -> findLargestMinusSmallest(new int[] { 10, 3, 2, 1 }),
                9L);
        run(11, "Duplicated extremes",
                () -> findLargestMinusSmallest(new int[] { 3, 9, 3, 9 }),
                6L);
        run(12, "Mix with zero",
                () -> findLargestMinusSmallest(new int[] { 0, -5, 5 }),
                10L);
        run(13, "Extreme values",
                () -> findLargestMinusSmallest(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }),
                4294967295L);

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
