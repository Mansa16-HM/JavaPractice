import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 05 · Count students who passed
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given marks of a class, return how many students passed. Pass mark is 35.
 *
 * Sample input to the function: [40, 22, 35, 90, 18]
 * Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countPassedStudents(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q05_CountPassedStudents.java then java
 * Q05_CountPassedStudents
 * (or run it in one step with: java Q05_CountPassedStudents.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q05_CountPassedStudents {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countPassedStudents(int[] marks) {
        if (marks == null || marks.length == 0)
            return 0;
        int countPassedStudents = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 35) {
                countPassedStudents++;
            }
        }
        return countPassedStudents;
    }

    // ======================================================================
    // Test cases for countPassedStudents: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countPassedStudents(new int[] { 40, 22, 35, 90, 18 }),
                3);
        run(2, "Null input",
                () -> countPassedStudents((int[]) null),
                0);
        run(3, "Empty",
                () -> countPassedStudents(new int[] {}),
                0);
        run(4, "Exactly the pass mark",
                () -> countPassedStudents(new int[] { 35 }),
                1);
        run(5, "One below the pass mark",
                () -> countPassedStudents(new int[] { 34 }),
                0);
        run(6, "Around the boundary",
                () -> countPassedStudents(new int[] { 34, 35, 36 }),
                2);
        run(7, "Everyone passes",
                () -> countPassedStudents(new int[] { 35, 60, 100 }),
                3);
        run(8, "Nobody passes",
                () -> countPassedStudents(new int[] { 0, 10, 34 }),
                0);
        run(9, "Duplicates",
                () -> countPassedStudents(new int[] { 35, 35, 20, 20 }),
                2);
        run(10, "Lowest and highest marks",
                () -> countPassedStudents(new int[] { 0, 100 }),
                1);
        run(11, "Negative mark (absent)",
                () -> countPassedStudents(new int[] { -1, 50 }),
                1);
        run(12, "Extreme values",
                () -> countPassedStudents(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }),
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
