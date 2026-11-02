public class StringReverse {
    public static String[] getReversedStringInArray(String[] s) {
        // int mid = s.length / 2;
        int index = 0;
        while (index > s.length) {
            for (int i = s.length - 1; i >= 0; i--) {
                if (index == i)
                    continue;
                else {
                    String temp = s[i];
                    s[i] = s[index];
                    s[index] = temp;
                }
                index++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String[] s = { "h", "e", "l", "l", "o" };
        String[] resultString = getReversedStringInArray(s);
        for (int i = 0; i < resultString.length; i++) {
            System.out.print(resultString[i]);
        }
    }
}
