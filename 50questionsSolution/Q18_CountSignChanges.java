import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 18 · Count the sign changes
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return how many times the sign changes from positive to negative or negative
 * to
 * positive.
 *
 * Sample input to the function: [3, -2, -5, 4, 6, -1]
 * Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countSignChanges(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q18_CountSignChanges.java then java
 * Q18_CountSignChanges
 * (or run it in one step with: java Q18_CountSignChanges.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q18_CountSignChanges {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countSignChanges(int[] numbers) {
        int Count = 0;
        if (numbers == null && numbers.length == 0)
            return 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                Count++;
            }
        }
        return Count;
    }

    // ======================================================================
    // Test cases for countSignChanges: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countSignChanges(new int[] { 3, -2, -5, 4, 6, -1 }),
                3);
        run(2, "Null input",
                () -> countSignChanges((int[]) null),
                0);
        run(3, "Empty",
                () -> countSignChanges(new int[] {}),
                0);
        run(4, "Single number",
                () -> countSignChanges(new int[] { -5 }),
                0);
        run(5, "Two numbers, opposite signs",
                () -> countSignChanges(new int[] { 4, -4 }),
                1);
        run(6, "All positive",
                () -> countSignChanges(new int[] { 1, 2, 3 }),
                0);
        run(7, "Only negatives",
                () -> countSignChanges(new int[] { -1, -9, -3 }),
                0);
        run(8, "Alternating every step",
                () -> countSignChanges(new int[] { 1, -1, 1, -1 }),
                3);
        run(9, "Zero between opposite signs",
                () -> countSignChanges(new int[] { 3, 0, -2 }),
                1);
        run(10, "Zeros between same signs",
                () -> countSignChanges(new int[] { 3, 0, 0, 5 }),
                0);
        run(11, "Only zeros",
                () -> countSignChanges(new int[] { 0, 0, 0 }),
                0);
        run(12, "Zeros at the start",
                () -> countSignChanges(new int[] { 0, 0, -4, 7 }),
                1);
        run(13, "Large values: product overflows",
                () -> countSignChanges(new int[] { 65536, -65536 }),
                1);
        run(14, "Extreme values",
                () -> countSignChanges(new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE }),
                2);

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
