import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 09 · Count numbers divisible by both 3 and 5
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Return how many numbers are divisible by both 3 and 5.
 *
 * Sample input to the function: [15, 9, 30, 10, 45, 7]
 * Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countDivisibleByThreeAndFive(...) below. Do not
 * change its signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q09_DivisibleBy3And5.java then java
 * Q09_DivisibleBy3And5
 * (or run it in one step with: java Q09_DivisibleBy3And5.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q09_DivisibleBy3And5 {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countDivisibleByThreeAndFive(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return 0;
        int Count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                Count++;
            }
        }
        return Count;
    }

    // ======================================================================
    // Test cases for countDivisibleByThreeAndFive: run this file to check your
    // code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countDivisibleByThreeAndFive(new int[] { 15, 9, 30, 10, 45, 7 }),
                3);
        run(2, "Null input",
                () -> countDivisibleByThreeAndFive((int[]) null),
                0);
        run(3, "Empty",
                () -> countDivisibleByThreeAndFive(new int[] {}),
                0);
        run(4, "Single match",
                () -> countDivisibleByThreeAndFive(new int[] { 15 }),
                1);
        run(5, "Only multiples of 3",
                () -> countDivisibleByThreeAndFive(new int[] { 9, 3, 12 }),
                0);
        run(6, "Only multiples of 5",
                () -> countDivisibleByThreeAndFive(new int[] { 10, 25, 5 }),
                0);
        run(7, "None divisible",
                () -> countDivisibleByThreeAndFive(new int[] { 1, 2, 4, 7 }),
                0);
        run(8, "All match",
                () -> countDivisibleByThreeAndFive(new int[] { 15, 30, 60, 90 }),
                4);
        run(9, "Zero counts",
                () -> countDivisibleByThreeAndFive(new int[] { 0, 1 }),
                1);
        run(10, "Negatives",
                () -> countDivisibleByThreeAndFive(new int[] { -15, -30, -9 }),
                2);
        run(11, "Duplicates",
                () -> countDivisibleByThreeAndFive(new int[] { 45, 45, 10 }),
                2);
        run(12, "Extreme values",
                () -> countDivisibleByThreeAndFive(new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 2147483640 }),
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
