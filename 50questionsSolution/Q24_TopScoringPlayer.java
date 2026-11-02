import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 24 · The player with the highest total
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given the scores of three players across matches, return which player (1, 2 or 3)
 *   has the highest total.
 *
 *   Sample input to the function:    [30, 45, 20], [50, 10, 40] and [25, 35, 30]
 *   Sample return from the function: 2
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findTopPlayer(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q24_TopScoringPlayer.java  then  java Q24_TopScoringPlayer
 *      (or run it in one step with:  java Q24_TopScoringPlayer.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q24_TopScoringPlayer {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int findTopPlayer(int[] firstScores, int[] secondScores, int[] thirdScores) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("findTopPlayer is not written yet");
    }

    // ======================================================================
    //  Test cases for findTopPlayer: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findTopPlayer(new int[]{30, 45, 20}, new int[]{50, 10, 40}, new int[]{25, 35, 30}),
                2);
        run(2, "Player 1 highest",
                () -> findTopPlayer(new int[]{90, 10}, new int[]{20, 20}, new int[]{30, 30}),
                1);
        run(3, "Player 3 highest (last)",
                () -> findTopPlayer(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6}),
                3);
        run(4, "One match each",
                () -> findTopPlayer(new int[]{7}, new int[]{9}, new int[]{8}),
                2);
        run(5, "Tie for top: players 2 and 3",
                () -> findTopPlayer(new int[]{10, 10}, new int[]{30}, new int[]{15, 15}),
                2);
        run(6, "Tie for top: players 1 and 3",
                () -> findTopPlayer(new int[]{50}, new int[]{10}, new int[]{25, 25}),
                1);
        run(7, "Three-way tie",
                () -> findTopPlayer(new int[]{10}, new int[]{10}, new int[]{10}),
                1);
        run(8, "Null for one player",
                () -> findTopPlayer(new int[]{5}, (int[]) null, new int[]{3}),
                1);
        run(9, "All null",
                () -> findTopPlayer((int[]) null, (int[]) null, (int[]) null),
                1);
        run(10, "Empty lists",
                () -> findTopPlayer(new int[]{}, new int[]{}, new int[]{4}),
                3);
        run(11, "Different match counts",
                () -> findTopPlayer(new int[]{10, 10, 10}, new int[]{25}, new int[]{15, 16}),
                3);
        run(12, "All totals negative",
                () -> findTopPlayer(new int[]{-5, -10}, new int[]{-3}, new int[]{-20, 5}),
                2);
        run(13, "Total beyond MAX_VALUE",
                () -> findTopPlayer(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, new int[]{1}, new int[]{2}),
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
