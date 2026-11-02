import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 12 · Replace every negative number with 0
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return the array with every negative number replaced by 0.
 *
 * Sample input to the function: [5, -3, 8, -1, 0]
 * Sample return from the function: [5, 0, 8, 0, 0]
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside replaceNegativesWithZero(...) below. Do not change
 * its signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q12_ReplaceNegativesWithZero.java then java
 * Q12_ReplaceNegativesWithZero
 * (or run it in one step with: java Q12_ReplaceNegativesWithZero.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q12_ReplaceNegativesWithZero {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int[] replaceNegativesWithZero(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return new int[] {};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                numbers[i] = 0;

        }
        return numbers;
    }

    // ======================================================================
    // Test cases for replaceNegativesWithZero: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> replaceNegativesWithZero(new int[] { 5, -3, 8, -1, 0 }),
                new int[] { 5, 0, 8, 0, 0 });
        run(2, "Null input",
                () -> replaceNegativesWithZero((int[]) null),
                new int[] {});
        run(3, "Empty",
                () -> replaceNegativesWithZero(new int[] {}),
                new int[] {});
        run(4, "Single negative",
                () -> replaceNegativesWithZero(new int[] { -7 }),
                new int[] { 0 });
        run(5, "Single positive",
                () -> replaceNegativesWithZero(new int[] { 7 }),
                new int[] { 7 });
        run(6, "No negatives",
                () -> replaceNegativesWithZero(new int[] { 1, 2, 3 }),
                new int[] { 1, 2, 3 });
        run(7, "Only negatives",
                () -> replaceNegativesWithZero(new int[] { -1, -2, -3 }),
                new int[] { 0, 0, 0 });
        run(8, "Zeros stay zero",
                () -> replaceNegativesWithZero(new int[] { 0, 0 }),
                new int[] { 0, 0 });
        run(9, "Boundary: -1 and 1",
                () -> replaceNegativesWithZero(new int[] { -1, 1 }),
                new int[] { 0, 1 });
        run(10, "Negatives at first and last position",
                () -> replaceNegativesWithZero(new int[] { -9, 2, 3, -9 }),
                new int[] { 0, 2, 3, 0 });
        run(11, "Duplicates",
                () -> replaceNegativesWithZero(new int[] { -4, -4, 4, 4 }),
                new int[] { 0, 0, 4, 4 });
        run(12, "Extreme values",
                () -> replaceNegativesWithZero(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }),
                new int[] { 0, Integer.MAX_VALUE });

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
