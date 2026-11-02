import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 20 · Subjects where Ravi beat Sita
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 * Given Ravi's and Sita's marks in the same five subjects, return in how many
 * subjects
 * Ravi scored more than Sita.
 *
 * Sample input to the function: [78, 65, 90, 55, 82] and [70, 80, 85, 60, 82]
 * Sample return from the function: 2
 *
 * HOW TO USE THIS FILE
 * 1. Write your code inside countSubjectsWon(...) below. Do not change its
 * signature.
 * 2. The function must RETURN the answer. Do not print it.
 * 3. Compile and run: javac Q20_SubjectsRaviWon.java then java
 * Q20_SubjectsRaviWon
 * (or run it in one step with: java Q20_SubjectsRaviWon.java)
 * 4. Fix your code until every test case says PASS.
 */
public class Q20_SubjectsRaviWon {

    // ======================================================================
    // Write your solution inside this function.
    // ======================================================================
    public static int countSubjectsWon(int[] raviMarks, int[] sitaMarks) {
        int GreaterScoreCountOfRavi = 0;
        if (raviMarks.length == 0 && sitaMarks.length == 0)
            return 0;
        if (raviMarks.length == 0)
            return 0;
        if (sitaMarks.length == 0)
            return 0;
        if (sitaMarks.length > raviMarks.length)
            return 1;
        for (int i = 0; i < raviMarks.length; i++) {
            if (raviMarks[i] > sitaMarks[i])
                GreaterScoreCountOfRavi++;
        }
        return GreaterScoreCountOfRavi;
    }

    // ======================================================================
    // Test cases for countSubjectsWon: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countSubjectsWon(new int[] { 78, 65, 90, 55, 82 }, new int[] { 70, 80, 85, 60, 82 }),
                2);
        run(2, "Null for Ravi",
                () -> countSubjectsWon((int[]) null, new int[] { 70, 80 }),
                0);
        run(3, "Null for Sita",
                () -> countSubjectsWon(new int[] { 70, 80 }, (int[]) null),
                0);
        run(4, "Both empty",
                () -> countSubjectsWon(new int[] {}, new int[] {}),
                0);
        run(5, "Single subject, Ravi wins",
                () -> countSubjectsWon(new int[] { 36 }, new int[] { 35 }),
                1);
        run(6, "Ravi wins every subject",
                () -> countSubjectsWon(new int[] { 90, 91, 92, 93, 94 }, new int[] { 10, 20, 30, 40, 50 }),
                5);
        run(7, "Sita wins every subject",
                () -> countSubjectsWon(new int[] { 40, 30, 20 }, new int[] { 41, 31, 21 }),
                0);
        run(8, "All ties",
                () -> countSubjectsWon(new int[] { 50, 50, 50 }, new int[] { 50, 50, 50 }),
                0);
        run(9, "Mix with zero",
                () -> countSubjectsWon(new int[] { 0, 100, 0 }, new int[] { 0, 99, 1 }),
                1);
        run(10, "Sita has fewer marks",
                () -> countSubjectsWon(new int[] { 80, 70, 60 }, new int[] { 75, 75 }),
                1);
        run(11, "Ravi has fewer marks",
                () -> countSubjectsWon(new int[] { 80 }, new int[] { 70, 90, 10 }),
                1);
        run(12, "Extreme values",
                () -> countSubjectsWon(new int[] { Integer.MAX_VALUE, -5 }, new int[] { Integer.MIN_VALUE, -5 }),
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
