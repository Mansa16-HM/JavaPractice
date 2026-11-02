import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 21 · The bigger number at each position
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given two arrays of the same length, return a new array with the bigger
 * number at
 * each position.
 *
 * Sample input to the function: [4, 9, 2, 7] and [6, 3, 8, 7]
 * Sample return from the function: [6, 9, 8, 7]
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside pickBiggerNumbers(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q21_BiggerAtEachPosition.java then java
 * Q21_BiggerAtEachPosition
 * (or run it in one step with: java Q21_BiggerAtEachPosition.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q21_BiggerAtEachPosition {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int[] pickBiggerNumbers(int[] firstNumbers, int[] secondNumbers) {
        int result[] = new int[] {};
        if (firstNumbers.length == 0 && secondNumbers.length == 0)
            return new int[] {};
        if (firstNumbers.length == 0 || secondNumbers.length == 0)
            return null;
        for (int i = 0; i < 4; i++) {
            if (firstNumbers[i] >= secondNumbers[i]) {
                result[i] = firstNumbers[i];
            } else {
                result[i] = secondNumbers[i];
            }
        }
        return result;

    }

    // ======================================================================
    // Test cases for pickBiggerNumbers: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> pickBiggerNumbers(new int[] { 4, 9, 2, 7 }, new int[] { 6, 3, 8, 7 }),
                new int[] { 6, 9, 8, 7 });
        run(2, "Null first array",
                () -> pickBiggerNumbers((int[]) null, new int[] { 1, 2 }),
                null);
        run(3, "Null second array",
                () -> pickBiggerNumbers(new int[] { 1, 2 }, (int[]) null),
                null);
        run(4, "Both empty",
                () -> pickBiggerNumbers(new int[] {}, new int[] {}),
                new int[] {});
        run(5, "Different lengths",
                () -> pickBiggerNumbers(new int[] { 1, 2, 3 }, new int[] { 4, 5 }),
                null);
        run(6, "Single element",
                () -> pickBiggerNumbers(new int[] { 5 }, new int[] { 3 }),
                new int[] { 5 });
        run(7, "First always bigger",
                () -> pickBiggerNumbers(new int[] { 9, 8, 7 }, new int[] { 1, 2, 3 }),
                new int[] { 9, 8, 7 });
        run(8, "Second always bigger",
                () -> pickBiggerNumbers(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }),
                new int[] { 4, 5, 6 });
        run(9, "All ties",
                () -> pickBiggerNumbers(new int[] { 5, 5, 5 }, new int[] { 5, 5, 5 }),
                new int[] { 5, 5, 5 });
        run(10, "Only negatives",
                () -> pickBiggerNumbers(new int[] { -4, -9, -1 }, new int[] { -6, -3, -1 }),
                new int[] { -4, -3, -1 });
        run(11, "Mix with zero",
                () -> pickBiggerNumbers(new int[] { 0, -2, 3 }, new int[] { -1, 0, 3 }),
                new int[] { 0, 0, 3 });
        run(12, "Extreme values",
                () -> pickBiggerNumbers(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE },
                        new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE }),
                new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE });

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
