import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 19 · The best over of the innings
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given runs scored in each over of a cricket match, return the over number (starting
 *   from 1) with the most runs.
 *
 *   Sample input to the function:    [6, 12, 4, 15, 9]
 *   Sample return from the function: 4
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findBestOver(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q19_BestCricketOver.java  then  java Q19_BestCricketOver
 *      (or run it in one step with:  java Q19_BestCricketOver.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q19_BestCricketOver {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static Integer findBestOver(int[] runsPerOver) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("findBestOver is not written yet");
    }

    // ======================================================================
    //  Test cases for findBestOver: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findBestOver(new int[]{6, 12, 4, 15, 9}),
                4);
        run(2, "Null input",
                () -> findBestOver((int[]) null),
                null);
        run(3, "Empty: no overs bowled",
                () -> findBestOver(new int[]{}),
                null);
        run(4, "Single over",
                () -> findBestOver(new int[]{7}),
                1);
        run(5, "Two overs",
                () -> findBestOver(new int[]{9, 11}),
                2);
        run(6, "Best over is the first",
                () -> findBestOver(new int[]{20, 5, 8}),
                1);
        run(7, "Best over is the last",
                () -> findBestOver(new int[]{3, 4, 18}),
                3);
        run(8, "Tie: earlier over wins",
                () -> findBestOver(new int[]{10, 15, 15, 2}),
                2);
        run(9, "All equal",
                () -> findBestOver(new int[]{6, 6, 6}),
                1);
        run(10, "All maiden overs",
                () -> findBestOver(new int[]{0, 0, 0, 0}),
                1);
        run(11, "Negative values (robustness)",
                () -> findBestOver(new int[]{-5, -3, -9}),
                2);
        run(12, "Extreme values",
                () -> findBestOver(new int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE}),
                1);

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
