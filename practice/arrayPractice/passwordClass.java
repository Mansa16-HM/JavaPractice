public class passwordClass {
    public boolean passwordCheckArr(char[] arr) {
        int digitCount = 0;
        int characterCount = 0;
        if (arr == null || arr.length == 0)
            return false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'A' && arr[i] <= 'Z') ||
                    (arr[i] >= 'a' && arr[i] <= 'z')) {
                characterCount++;
            }
            if (arr[i] >= '0' && arr[i] <= '9') {
                digitCount++;
            }
        }
        if (characterCount >= 8 && digitCount >= 1)
            return true;
        return false;
    }

    public static void main(String args[]) {
        char[] arr = new char[] { '9', 'C', 'o', 'r', 'a', 'm', '9', 'x', 'Z' };
        passwordClass obj = new passwordClass();
        boolean result = obj.passwordCheckArr(arr);
        System.out.println(result);
    }
}