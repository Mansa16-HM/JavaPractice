
public class CheckPasswordCheck1 {
    public static void IsCheckPasswordCheck(char[] arr) {
        boolean passwordLength = false;
        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isCharacter = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length >= 8) {
                passwordLength = true;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                isDigit = true;
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                isUpperCase = true;
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                isLowerCase = true;
            } else if (arr[i] >= '!' && arr[i] <= '/') {
                isCharacter = true;
            }
        }
        if (passwordLength == true &&
                isDigit == true && isUpperCase == true &&
                isLowerCase == true &&
                isCharacter == true) {
            System.out.println("Valid Password!");
        } else {
            System.out.println("Enter the password having atleast minimum 8 character,");
            System.out.println("1 UpperCase,smallerCase character,Atleast 1 special symbol,(sample:Password*25)");

        }

    }

    public static void main(String args[]) {
        char[] arr = new char[] { 'P', 'a', 's', 's', 'w', 'o', 'r', 'd', ' ', '1' };
        IsCheckPasswordCheck(arr);
    }

}
