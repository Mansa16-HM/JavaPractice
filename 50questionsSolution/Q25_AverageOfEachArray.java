import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 25 · The average of each of three arrays
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given three arrays, return the average of each array as a new array.
 *
 *   Sample input to the function:    [10, 20, 30], [5, 15] and [8, 8, 8, 8]
 *   Sample return from the function: [20, 10, 8]
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findAverages(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q25_AverageOfEachArray.java  then  java Q25_AverageOfEachArray
 *      (or run it in one step with:  java Q25_AverageOfEachArray.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q25_AverageOfEachArray {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static double[] findAverages(int[] firstArray, int[] secondArray, int[] thirdArray) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("findAverages is not written yet");
    }

    // ======================================================================
    //  Test cases for findAverages: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findAverages(new int[]{10, 20, 30}, new int[]{5, 15}, new int[]{8, 8, 8, 8}),
                new double[]{20.0, 10.0, 8.0});
        run(2, "Fractional averages",
                () -> findAverages(new int[]{1, 2}, new int[]{1, 2, 2}, new int[]{7}),
                new double[]{1.5, 5.0 / 3, 7.0});
        run(3, "Null first array",
                () -> findAverages((int[]) null, new int[]{4}, new int[]{6, 8}),
                new double[]{0.0, 4.0, 7.0});
        run(4, "All null",
                () -> findAverages((int[]) null, (int[]) null, (int[]) null),
                new double[]{0.0, 0.0, 0.0});
        run(5, "Empty arrays",
                () -> findAverages(new int[]{}, new int[]{3, 5}, new int[]{}),
                new double[]{0.0, 4.0, 0.0});
        run(6, "Single element each",
                () -> findAverages(new int[]{5}, new int[]{-5}, new int[]{0}),
                new double[]{5.0, -5.0, 0.0});
        run(7, "Only negatives",
                () -> findAverages(new int[]{-10, -20}, new int[]{-1, -2}, new int[]{-1, -2, -3}),
                new double[]{-15.0, -1.5, -2.0});
        run(8, "Mixed signs and zero",
                () -> findAverages(new int[]{5, -5}, new int[]{0, 0, 0}, new int[]{-3, 4}),
                new double[]{0.0, 0.0, 0.5});
        run(9, "Very different lengths",
                () -> findAverages(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{100}, new int[]{2, 3}),
                new double[]{5.5, 100.0, 2.5});
        run(10, "Duplicates",
                () -> findAverages(new int[]{4, 4, 4}, new int[]{9, 9}, new int[]{2, 2, 5, 5}),
                new double[]{4.0, 9.0, 3.5});
        run(11, "Extreme values (sum overflows int)",
                () -> findAverages(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}),
                new double[]{2147483647.0, -2147483648.0, -0.5});

        printSummary();
    }

    // ======================================================================
    //  Test harness: you do not need to change anything below this line.
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
