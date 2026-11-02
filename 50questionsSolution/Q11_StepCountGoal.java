import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 11 · Days above 10,000 steps and the best day
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given daily step counts, return how many days crossed 10,000 steps and the
 * best
 * day's steps, as [days, best].
 *
 * Sample input to the function: [8000, 12000, 10500, 9000, 15000]
 * Sample return from the function: [3, 15000]
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countGoalDaysAndBest(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q11_StepCountGoal.java then java Q11_StepCountGoal
 * (or run it in one step with: java Q11_StepCountGoal.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q11_StepCountGoal {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int[] countGoalDaysAndBest(int[] stepCounts) {
        if (stepCounts == null || stepCounts.length == 0)
            return new int[] { 0, 0 };
        int StepCount = 0;
        int bestStepCount = stepCounts[0];

        for (int index = 0; index < stepCounts.length; index++) {
            if (stepCounts[index] > 10000) {
                StepCount++;
            }
            if (bestStepCount < stepCounts[index]) {
                bestStepCount = stepCounts[index];
            }

        }

        int[] result = new int[] { StepCount, bestStepCount };
        return result;
    }

    // ======================================================================
    // Test cases for countGoalDaysAndBest: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countGoalDaysAndBest(new int[] { 8000, 12000, 10500, 9000, 15000 }),
                new int[] { 3, 15000 });
        run(2, "Null input",
                () -> countGoalDaysAndBest((int[]) null),
                new int[] { 0, 0 });
        run(3, "Empty",
                () -> countGoalDaysAndBest(new int[] {}),
                new int[] { 0, 0 });
        run(4, "Single day above goal",
                () -> countGoalDaysAndBest(new int[] { 12000 }),
                new int[] { 1, 12000 });
        run(5, "Single day below goal",
                () -> countGoalDaysAndBest(new int[] { 5000 }),
                new int[] { 0, 5000 });
        run(6, "Boundary: exactly 10,000",
                () -> countGoalDaysAndBest(new int[] { 10000, 10001 }),
                new int[] { 1, 10001 });
        run(7, "No day crossed",
                () -> countGoalDaysAndBest(new int[] { 500, 9999, 7000 }),
                new int[] { 0, 9999 });
        run(8, "Best day is the first day",
                () -> countGoalDaysAndBest(new int[] { 20000, 11000, 3000 }),
                new int[] { 2, 20000 });
        run(9, "Every day crossed",
                () -> countGoalDaysAndBest(new int[] { 10001, 25000, 18000 }),
                new int[] { 3, 25000 });
        run(10, "Tie for best day",
                () -> countGoalDaysAndBest(new int[] { 15000, 9000, 15000 }),
                new int[] { 2, 15000 });
        run(11, "All rest days (zero)",
                () -> countGoalDaysAndBest(new int[] { 0, 0, 0 }),
                new int[] { 0, 0 });
        run(12, "Extreme value",
                () -> countGoalDaysAndBest(new int[] { Integer.MAX_VALUE, 10001 }),
                new int[] { 2, Integer.MAX_VALUE });

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
