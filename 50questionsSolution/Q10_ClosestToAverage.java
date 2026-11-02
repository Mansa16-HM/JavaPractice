import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 10 · Find the number closest to the average
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return the number that is closest to the average of the array.
 *
 * Sample input to the function: [2, 9, 4, 15]
 * Sample return from the function: 9
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside findClosestToAverage(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q10_ClosestToAverage.java then java
 * Q10_ClosestToAverage
 * (or run it in one step with: java Q10_ClosestToAverage.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q10_ClosestToAverage {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static Integer findClosestToAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return null;
        double minDiff = Integer.MIN_VALUE;
        int nearest = numbers[0];
        long sum = 0l;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            double Avg = sum / numbers.length;
            minDiff = nearest - Avg;
            if (minDiff < 0)
                minDiff = -minDiff;
            double CurrentDiff = 0;
            for (int index = 1; index < numbers.length; index++) {
                CurrentDiff = numbers[index] - Avg;
                if (CurrentDiff < minDiff) {
                    minDiff = CurrentDiff;
                    nearest = numbers[index];
                }
            }
        }
        return nearest;

    }

    // ======================================================================
    // Test cases for findClosestToAverage: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findClosestToAverage(new int[] { 2, 9, 4, 15 }),
                9);
        run(2, "Null input",
                () -> findClosestToAverage((int[]) null),
                null);
        run(3, "Empty",
                () -> findClosestToAverage(new int[] {}),
                null);
        run(4, "Single number",
                () -> findClosestToAverage(new int[] { 7 }),
                7);
        run(5, "Tie: first one wins",
                () -> findClosestToAverage(new int[] { 1, 2 }),
                1);
        run(6, "Average is in the array",
                () -> findClosestToAverage(new int[] { 4, 5, 6 }),
                5);
        run(7, "Fractional average (2.33…)",
                () -> findClosestToAverage(new int[] { 1, 3, 3 }),
                3);
        run(8, "All equal",
                () -> findClosestToAverage(new int[] { 5, 5, 5 }),
                5);
        run(9, "Only negatives",
                () -> findClosestToAverage(new int[] { -10, -2, -6 }),
                -6);
        run(10, "Tie across zero",
                () -> findClosestToAverage(new int[] { -3, 1 }),
                -3);
        run(11, "Mix with zero",
                () -> findClosestToAverage(new int[] { 0, 10, 3 }),
                3);
        run(12, "Duplicates",
                () -> findClosestToAverage(new int[] { 8, 1, 8, 20 }),
                8);
        run(13, "Sum too big for int",
                () -> findClosestToAverage(new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, 1 }),
                Integer.MAX_VALUE);
        run(14, "Extreme values, tie",
                () -> findClosestToAverage(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }),
                Integer.MIN_VALUE);

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
