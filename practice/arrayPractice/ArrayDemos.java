
public class ArrayDemos {
    // method for counting the vowels and consonent count in the array;
    public int[] VowelConsonentCountInArrayElements(char[] arr) {

        if (arr == null && arr.length == 0) {
            return new int[] {};
        }
        int vowelCount = 0;
        int consonentCount = 0;
        // for (char ch = 'a'; ch <= 'z'; ch++) plz dont use this becouse it will ateke
        // the count of the entire alphabet in series
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'o' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'u')
                vowelCount++;
            else
                consonentCount++;

        }
        int[] Resultarr = new int[] { vowelCount, consonentCount };
        return Resultarr;
    }

    // method to count the given key element how many times that has repeated in the
    // array
    public int getCountOfCharacterInArray(char[] arr, char ch) {
        if (arr == null && arr.length == 0) {
            return -1;
        }
        int keyCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                keyCount++;
            }
        }
        return keyCount;
    }

    // method to convert the given array elements into Large elements
    public char[] smallToCapitalArrayCharacter(char[] arr) {
        char[] result = new char[arr.length];
        if (arr == null && arr.length == 0)
            return new char[] {};
        for (int i = 0; i < arr.length; i++) {

            result[i] = Character.toUpperCase(arr[i]);

        }

        return result;
    }

    // method to take the sub array consist of Last and first character from the
    // given array
    public char[] CreatingSubArrayfromGivenArray(char[] arr) {

        if (arr == null || arr.length == 0)
            return new char[] {};
        char first = arr[0];
        char last = arr[arr.length - 1];

        char[] subArray = new char[] { first, last };
        return subArray;

    }

    // to print the array elements
    public void printList(char[] arr) {
        System.out.print("[");
        for (char c = 0; c < arr.length; c++) {

            System.out.print(arr[c] + " ");
        }
        System.out.println("]");
    }

    public int CapitalCountInAnArray(char[] arr) {
        int CapitalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                CapitalCount++;
            }
        }
        return CapitalCount;
    }

    // method to check the password formate
    public boolean passwordCheckArr(char[] arr) {
        int digitCount = 0;
        int characterCount = 0;
        if (arr == null || arr.length == 0)
            return false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'A' && arr[i] <= 'Z') ||
                    (arr[i] >= 'A' && arr[i] <= 'Z')) {
                characterCount++;
            }
            if (arr[i] >= 0 && arr[i] <= 9) {
                digitCount++;
            }
        }
        if (characterCount > 8 & digitCount >= 1)
            return true;
        return false;
    }

    // methos to convert the space into Underscore
    public char[] SpacetoUnderScoreReplacement(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == ' ')// ascii value of the space is 32 or use space also
                arr[i] = '_';
        }
        return arr;
    }

    // method to count the number of the words in the array by using the separator
    public int GetWordCountIntheArray(char[] CharArray) {
        int wordCount = 1;
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] == ',') {
                wordCount++;
            }
        }

        return wordCount;
    }

    //

    public char[] getSubArrayWithoutVowelFromArray(char[] VCarr) {
        if (VCarr == null || VCarr.length == 0) {
            return new char[0];
        }

        char[] result = new char[VCarr.length];
        int index = 0;

        for (int i = 0; i < VCarr.length; i++) {
            if (VCarr[i] == 'a' || VCarr[i] == 'e' ||
                    VCarr[i] == 'i' || VCarr[i] == 'o' ||
                    VCarr[i] == 'u') {
                continue;
            }

            result[index] = VCarr[i];
            index++;
        }

        return result;
    }

    // method to get the sub array from the given array which is having the first
    // and last letter in the capital case
    public static char[] GetSubArrayFromGivenArray(char[] charArray) {
        char first = charArray[0];
        char UpperFirst = Character.toUpperCase(first);
        char last = charArray[charArray.length - 1];
        char UpperLast = Character.toUpperCase(last);
        char[] subArray = new char[] { UpperFirst, UpperLast };
        return subArray;
    }

    public char GetLastCharacterFromArray(char[] array) {
        char LastCharacter = 0;
        int i = 0;
        while (i >= 0) {
            if (i == (array.length - 1))
                LastCharacter = array[i];
            i++;
        }
        return LastCharacter;
    }

    public static void main(String args[]) {
        char[] arr = new char[] { 'I', ',', 'L', 'O', 'V', 'A', ',', 'J', 'A', 'V', 'A' };
        ArrayDemos obj = new ArrayDemos();
        /*
         * int[] resultantarr = obj.VowelConsonentCountInArrayElements(arr);
         * System.out.println(Arrays.toString(resultantarr));
         */

        /*
         * int result = obj.getCountOfCharacterInArray(arr, 'a');
         * System.out.println(result);
         */

        /*
         * System.out.print("[");
         * char[] resultArray = obj.smallToCapitalArrayCharacter(arr);
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print("'");
         * System.out.print(resultArray[i]);
         * System.out.print("'");
         * if (i < resultArray.length - 1) {
         * System.out.print(",");
         * }
         * }
         * System.out.print("]");
         */

        /*
         * char[] resultantArray = obj.CreatingSubArrayfromGivenArray(arr);
         * obj.printList(arr);l̥l̥2h
         * // System.out.println(resultantArray);
         * obj.printList(resultantArray);
         */
        /*
         * int count = obj.CapitalCountInAnArray(arr);
         * System.out.println(count);
         */

        /*
         * boolean result = obj.passwordCheckArr(arr);
         * System.out.println(result);
         */
        /*
         * char[] UnderScoreArray = obj.SpacetoUnderScoreReplacement(arr);
         * System.out.println(UnderScoreArray);
         */
        /*
         * int Count = obj.GetWordCountIntheArray(arr);
         * System.out.println(Count);
         */

        /*
         * char[] result = GetSubArrayFromGivenArray(arr);
         * System.out.println(Arrays.toString(result));
         */
        /*
         * char[] Array = obj.getSubArrayWithoutVowelFromArray(arr);
         * System.out.println(Array);
         */
        char LastCharacter = obj.GetLastCharacterFromArray(arr);
        System.out.println(LastCharacter);

    }
}
