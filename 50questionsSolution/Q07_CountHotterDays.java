import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 07 · Count days hotter than the day before
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given a week of temperatures, return how many days were hotter than the day
 * before.
 *
 * Sample input to the function: [30, 32, 31, 35, 36, 34, 37]
 * Sample return from the function: 4
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countHotterDays(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q07_CountHotterDays.java then java
 * Q07_CountHotterDays
 * (or run it in one step with: java Q07_CountHotterDays.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q07_CountHotterDays {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countHotterDays(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0 || temperatures.length == 1)
            return 0;
        int Count = 0;
        int PrevDay = 0;
        while (PrevDay < temperatures.length - 1) {
            for (int nextDay = PrevDay + 1; nextDay < temperatures.length; nextDay++) {
                if (temperatures[PrevDay] < temperatures[nextDay])
                    Count++;
            }
            PrevDay++;
        }
        return Count;
    }

    // ======================================================================
    // Test cases for countHotterDays: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countHotterDays(new int[] { 30, 32, 31, 35, 36, 34, 37 }),
                4);
        run(2, "Null input",
                () -> countHotterDays((int[]) null),
                0);
        run(3, "Empty",
                () -> countHotterDays(new int[] {}),
                0);
        run(4, "Single day",
                () -> countHotterDays(new int[] { 30 }),
                0);
        run(5, "Two days, hotter",
                () -> countHotterDays(new int[] { 30, 31 }),
                1);
        run(6, "Two days, cooler",
                () -> countHotterDays(new int[] { 31, 30 }),
                0);
        run(7, "Equal days are not hotter",
                () -> countHotterDays(new int[] { 30, 30, 30 }),
                0);
        run(8, "Always rising (sorted)",
                () -> countHotterDays(new int[] { 25, 26, 27, 28, 29, 30, 31 }),
                6);
        run(9, "Always falling",
                () -> countHotterDays(new int[] { 31, 30, 29, 28 }),
                0);
        run(10, "Only negatives (Leh winter)",
                () -> countHotterDays(new int[] { -5, -3, -8, -2 }),
                2);
        run(11, "No wrap-around to day 0",
                () -> countHotterDays(new int[] { 40, 30, 35 }),
                1);
        run(12, "Extreme jump up",
                () -> countHotterDays(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE }),
                1);
        run(13, "Extreme drop down",
                () -> countHotterDays(new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE }),
                0);

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
