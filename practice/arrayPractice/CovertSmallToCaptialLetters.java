import java.util.Arrays;

public class CovertSmallToCaptialLetters {
    public static char[] convertSmalltoCaptivalLetters(char[] ch) {
        if (ch == null)
            return null;

        if (ch.length == 0)
            return new char[] {};

        char[] result = new char[ch.length];

        for (int i = 0; i <= ch.length - 1; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {

                char letter = (char) (ch[i] - 32);
                result[i] = letter;

            } else {
                char letter = (char) (ch[i] + 32);
                result[i] = letter;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'p', 'p', 'l', 'e', 'A' };
        char[] output = convertSmalltoCaptivalLetters(ch);
        System.out.println(Arrays.toString(output));
    }
}