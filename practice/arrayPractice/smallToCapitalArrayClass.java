import java.util.Arrays;

public class smallToCapitalArrayClass {
    public static char[] smallToCapitalArrayCharacter(char[] arr) {
        char[] result = new char[arr.length];
        if (arr == null && arr.length == 0)
            return new char[] {};
        
        for (int j = 0; j < arr.length; j++) {

            result[j] = Character.toUpperCase(arr[j]);
            

        }

        return result;
    }

    public static void main(String[] args) {
        char[] charArr = new char[] { 'c', 'o', 'd', 'e', '7', 'p', 'P' };
        char[] result = smallToCapitalArrayCharacter(charArr);
        System.out.println(Arrays.toString(result));
    }
}