 class NumberSystem {
    public static void main(String[] args) {

        String s1 = "0123";
        String s2 = "123";
        String s3 = "OXF";
        String s4 = "032";

        checkNumberSystem(s1);
        checkNumberSystem(s2);
        checkNumberSystem(s3);
        checkNumberSystem(s4);
    }

    static void checkNumberSystem(String s) {

        if (s.startsWith("0X") || s.startsWith("0x")) {
      /* if ((s >= '0' && s <= '9') ||
                  (s >= 'A' && s <= 'F') ||
                  (s >= 'a' && s <= 'f'))
                  { */
            System.out.println(s + " -> Hexadecimal, Radix = 16");
        }
        else if (s.startsWith("0B") || s.startsWith("0b")) {
            System.out.println(s + " -> Binary, Radix = 2");
        }
        else if (s.length() > 1 && s.startsWith("0")) {
            System.out.println(s + " -> Octal, Radix = 8");
        }
        else {
            System.out.println(s + " -> Decimal, Radix = 10");
        }
    } 
} /* 
public class Sep3 {

    public static void main(String[] args) {

        String s1 = "0b10";
        String s2 = "123";
        String s3 = "0X20";
        String s4 = "F032";

        check(s1);
        check(s2);
        check(s3);
        check(s4);
    }

    static void check(String s) {

        if (s.startsWith("0X") || s.startsWith("0x")) {
            String value = s.substring(2);

            if (isValid(value, 16)) {
                System.out.println(s + " → Hexadecimal, Radix = 16");
            }
        }

        else if (s.startsWith("0B") || s.startsWith("0b")) {
            String value = s.substring(2);

            if (isValid(value, 2)) {
                System.out.println(s + " → Binary, Radix = 2");
            }
        }

        else if (s.startsWith("0") && s.length() > 1) {
            String value = s.substring(1);

            if (isValid(value, 8)) {
                System.out.println(s + " → Octal, Radix = 8");
            }
        }

        else {
            if (isValid(s, 10)) {
                System.out.println(s + " → Decimal, Radix = 10");
            }
        }
    }

    static boolean isValid(String value, int radix) {

        try {
            Integer.parseInt(value, radix);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
} */ 