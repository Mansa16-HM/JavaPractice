import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 15 · Shopping cart total with a 10% discount
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given prices of items in a shopping cart, give a 10% discount if the total is
 * above
 * 1000. Return the amount to pay.
 *
 * Sample input to the function: [400, 350, 450]
 * Sample return from the function: 1080
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside calculateAmountToPay(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q15_CartDiscountTotal.java then java
 * Q15_CartDiscountTotal
 * (or run it in one step with: java Q15_CartDiscountTotal.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q15_CartDiscountTotal {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static double calculateAmountToPay(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0.0;
        long Sum = 0;
        double AfterDiscountPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            Sum += prices[i];
        }
        if (Sum > 1000) {
            double discount = Sum * 10 / 100.0;
            AfterDiscountPrice = Sum - discount;
            return AfterDiscountPrice;
        } else {
            return Sum;
        }
    }

    // ======================================================================
    // Test cases for calculateAmountToPay: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> calculateAmountToPay(new int[] { 400, 350, 450 }),
                1080.0);
        run(2, "Null input",
                () -> calculateAmountToPay((int[]) null),
                0.0);
        run(3, "Empty cart",
                () -> calculateAmountToPay(new int[] {}),
                0.0);
        run(4, "Single cheap item",
                () -> calculateAmountToPay(new int[] { 250 }),
                250.0);
        run(5, "Boundary: exactly 1000, no discount",
                () -> calculateAmountToPay(new int[] { 600, 400 }),
                1000.0);
        run(6, "Boundary: 1001, discount",
                () -> calculateAmountToPay(new int[] { 1001 }),
                900.9);
        run(7, "Boundary: 999, no discount",
                () -> calculateAmountToPay(new int[] { 500, 499 }),
                999.0);
        run(8, "Discount leaves paise",
                () -> calculateAmountToPay(new int[] { 505, 500 }),
                904.5);
        run(9, "Duplicates: same item twice",
                () -> calculateAmountToPay(new int[] { 700, 700 }),
                1260.0);
        run(10, "Crosses 1000, then a return brings it back",
                () -> calculateAmountToPay(new int[] { 600, 500, -200 }),
                900.0);
        run(11, "All zero prices",
                () -> calculateAmountToPay(new int[] { 0, 0, 0 }),
                0.0);
        run(12, "Extreme: total overflows int",
                () -> calculateAmountToPay(new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE }),
                3865470564.6);

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
