
public class ARray {
    public char[] getSubArrayWithoutVowelFromArray(char[] VCarr) {
        if (VCarr == null || VCarr.length == 0) {
            return new char[0];
        }

        char[] result = new char[VCarr.length];
        int index = 0;

        for (int i = 0; i < VCarr.length; i++) {
            char ch = Character.toLowerCase(VCarr[i]);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                continue;
            }

            result[index] = VCarr[i];
            index++;
        }

        char[] finalArray = new char[index];

        for (int i = 0; i < index; i++) {
            finalArray[i] = result[i];
        }

        return finalArray;
    }

    public static void main(String args[]) {
        char[] arr = {
                'I', ',', 'L', 'O', 'V', 'A',
                ',', 'J', 'A', 'V', 'A'
        };

        ARray obj = new ARray();
        char[] Array = obj.getSubArrayWithoutVowelFromArray(arr);

        System.out.println(Array);
    }

}
