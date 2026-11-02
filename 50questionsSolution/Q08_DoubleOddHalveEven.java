import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 08 · Double the odd numbers, halve the even ones
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return a new array where every odd number is doubled and every even number is
 * halved.
 *
 * Sample input to the function: [4, 7, 10, 3]
 * Sample return from the function: [2, 14, 5, 6]
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside doubleOddHalveEven(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q08_DoubleOddHalveEven.java then java
 * Q08_DoubleOddHalveEven
 * (or run it in one step with: java Q08_DoubleOddHalveEven.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q08_DoubleOddHalveEven {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int[] doubleOddHalveEven(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return new int[] {};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] /= 2;
            } else {
                numbers[i] *= 2;
            }
        }
        return numbers;
    }

    // ======================================================================
    // Test cases for doubleOddHalveEven: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> doubleOddHalveEven(new int[] { 4, 7, 10, 3 }),
                new int[] { 2, 14, 5, 6 });
        run(2, "Null input",
                () -> doubleOddHalveEven((int[]) null),
                new int[] {});
        run(3, "Empty",
                () -> doubleOddHalveEven(new int[] {}),
                new int[] {});
        run(4, "Single odd number",
                () -> doubleOddHalveEven(new int[] { 5 }),
                new int[] { 10 });
        run(5, "Single even number",
                () -> doubleOddHalveEven(new int[] { 8 }),
                new int[] { 4 });
        run(6, "Even numbers whose half is odd",
                () -> doubleOddHalveEven(new int[] { 10, 6, 2 }),
                new int[] { 5, 3, 1 });
        run(7, "Negative odd numbers",
                () -> doubleOddHalveEven(new int[] { -3, -7 }),
                new int[] { -6, -14 });
        run(8, "Negative even numbers",
                () -> doubleOddHalveEven(new int[] { -4, -10 }),
                new int[] { -2, -5 });
        run(9, "Mix with zero",
                () -> doubleOddHalveEven(new int[] { 0, 1, -1 }),
                new int[] { 0, 2, -2 });
        run(10, "All odd",
                () -> doubleOddHalveEven(new int[] { 1, 3, 5 }),
                new int[] { 2, 6, 10 });
        run(11, "Duplicates",
                () -> doubleOddHalveEven(new int[] { 6, 6, 9, 9 }),
                new int[] { 3, 3, 18, 18 });
        run(12, "Extreme values",
                () -> doubleOddHalveEven(new int[] { Integer.MIN_VALUE, 2147483646, 1073741823 }),
                new int[] { -1073741824, 1073741823, 2147483646 });

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
