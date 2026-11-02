import java.util.Scanner;

public class ExpandString {

    static int calculateWriteIndex(char[] str, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (str[i] >= '2' && str[i] <= '9') {
                count = count + (str[i] - '0') - 1;
            } else {
                count++;
            }
        }
        return (count - 1);
    }

    static int copyCharacterFromRightToLeft(char[] str, char ch, int count, int writeIndex) {
        while (count > 0) {
            str[writeIndex] = ch;
            writeIndex--;
            count--;
        }
        return writeIndex;
    }

    static void expandString(char[] str, int length) {
        int writeIndex = calculateWriteIndex(str, length);
        int readIndex = length - 1;
        while (writeIndex >= 0) {
            if (str[readIndex] >= '2' && str[readIndex] <= '9') {
                char ch = str[readIndex - 1];
                int count = str[readIndex] - '0';
                writeIndex = copyCharacterFromRightToLeft(str, ch, count, writeIndex);
                readIndex--;
            } else {
                str[writeIndex] = str[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (example a3b2c4): ");
        String input = sc.nextLine().trim();
        sc.close();

        char[] original = input.toCharArray();
        int expandedLength = calculateWriteIndex(original, original.length) + 1;

        // buffer must be big enough to hold the expanded result
        char[] str = new char[Math.max(expandedLength, original.length)];
        for (int i = 0; i < original.length; i++) {
            str[i] = original[i];
        }

        expandString(str, original.length);

        System.out.println("Input  : " + input);
        System.out.println("Output : " + new String(str, 0, expandedLength));
    }
}