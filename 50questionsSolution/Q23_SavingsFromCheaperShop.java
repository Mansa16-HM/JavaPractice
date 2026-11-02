import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 23 · Money saved by buying at the cheaper shop
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given prices of the same items at Shop A and Shop B, return how much money is saved
 *   by buying each item at the cheaper shop instead of buying everything at Shop A.
 *
 *   Sample input to the function:    [100, 250, 80, 40] and [90, 260, 70, 45]
 *   Sample return from the function: 20
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside calculateSavings(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q23_SavingsFromCheaperShop.java  then  java Q23_SavingsFromCheaperShop
 *      (or run it in one step with:  java Q23_SavingsFromCheaperShop.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q23_SavingsFromCheaperShop {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int calculateSavings(int[] shopAPrices, int[] shopBPrices) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("calculateSavings is not written yet");
    }

    // ======================================================================
    //  Test cases for calculateSavings: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> calculateSavings(new int[]{100, 250, 80, 40}, new int[]{90, 260, 70, 45}),
                20);
        run(2, "Null Shop A",
                () -> calculateSavings((int[]) null, new int[]{90, 260}),
                0);
        run(3, "Null Shop B",
                () -> calculateSavings(new int[]{100, 250}, (int[]) null),
                0);
        run(4, "Both empty",
                () -> calculateSavings(new int[]{}, new int[]{}),
                0);
        run(5, "Single item, B cheaper",
                () -> calculateSavings(new int[]{50}, new int[]{30}),
                20);
        run(6, "B always dearer",
                () -> calculateSavings(new int[]{10, 20}, new int[]{15, 25}),
                0);
        run(7, "B cheaper or equal",
                () -> calculateSavings(new int[]{100, 200, 300}, new int[]{90, 150, 300}),
                60);
        run(8, "All prices equal",
                () -> calculateSavings(new int[]{40, 40, 40}, new int[]{40, 40, 40}),
                0);
        run(9, "Zero price (free item)",
                () -> calculateSavings(new int[]{60, 0}, new int[]{0, 10}),
                60);
        run(10, "Shop B has fewer prices",
                () -> calculateSavings(new int[]{100, 200, 300}, new int[]{90, 150}),
                60);
        run(11, "Shop A has fewer prices",
                () -> calculateSavings(new int[]{100}, new int[]{50, 10}),
                50);
        run(12, "Extreme values",
                () -> calculateSavings(new int[]{Integer.MAX_VALUE, 5}, new int[]{0, 5}),
                Integer.MAX_VALUE);

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
