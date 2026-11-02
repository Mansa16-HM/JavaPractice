
//import java.lang.reflect.Array;

//public class myArrayQ
/*
 * {
 * static int[] grow(int[] arr) {
 * int[6] arr1=new int[ ];
 * for(int i=0;i<arr1.length;i++)
 * {
 * arr1[i]=arr[i];
 * System.out.println(arr1[i]);
 * }
 * return;
 * }
 * public static void main(String args[])
 * {
 * //int[] arr;
 * int length=3;
 * int arr[length] = {10,20,30};
 * myArrayQ obj=new myArrayQ();
 * int[] resultArray=obj.grow(arr);
 * System.out.println(resultArray);
 * }
 * }
 */
/*
 * import java.util.Arrays;
 * 
 * public class myArrayQ {
 * static int[] grow(int[] arr) {
 * int[] arr1 = new int[6];
 * 
 * for (int i = 0; i < arr.length; i++) {
 * arr1[i] = arr[i];
 * }
 * 
 * return arr1;
 * }
 * 
 * public static void main(String args[]) {
 * int[] arr = { 10, 20, 30 };
 * 
 * int[] result = grow(new int[] { 1, 2, 3, 4, 5 });
 * 
 * System.out.println(Arrays.toString(result));
 * }
 * }
 */
/*
 * public class myArrayQ {
 * static void show(int... x) {
 * System.out.println(x.length);
 * }
 * 
 * public static void main(String[] args) {
 * show();
 * show(5);
 * show(new int[] { 1, 2, 3 });
 * }
 * }
 */

// public class myArrayQ
/*
 * {
 * static int countEven(int... nums) {
 * int count = 0;
 * 
 * for (int i = 0; i < nums.length; i++) {
 * if (nums[i] % 2 == 0) {
 * count++;
 * }
 * }
 * 
 * return count;
 * }
 * 
 * public static void main(String args[]) {
 * System.out.println(countEven());
 * System.out.println(countEven(5));
 * System.out.println(countEven(2, 7, 10, 4));
 * System.out.println(countEven(new int[] { 6, 9 }));
 * }
 * }
/*  
public class myArrayQ {
    static int countOdd(int... nums) {

        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            while (nums[i] >= 0) {
                if (nums[i] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr ;
        arr = new int[] { -1, 0, 7, 9, 4, 2, -9 };
        int result = countOdd(arr);
        System.out.println("count of the odd Nunbers " + result);

    }
} */
/* public class myArrayQ {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);

        char ch = 'A';
        System.out.println(ch + 1);
    }
} */

/* public class myArrayQ {
    public static void main(String[] args) {
        byte[] b = new byte[2];
        b[0] = 10;
        b[1] = (byte) (b[0] + 5);

        char[] c = new char[2];
        c[0] = 'A';

        System.out.println((int) c[1]);
        System.out.println(c[0] + 1);
    }
} */
/*
 * static int calculate(int... nums) {
 * 
 * byte count = 0;
 * 
 * for (int i = 0; i < nums.length; i++) {
 * 
 * if (nums[i] % 2 == 0) {
 * count++;
 * }
 * }
 * 
 * return count;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * // int result = calculate(10, 15, 20, 25, 30);
 * 
 * // System.out.println(result);
 * int a = 5;
 * 
 * int b = a++;
 * 
 * int c = ++a;
 * 
 * System.out.println(a);
 * System.out.println(b);
 * System.out.println(c);
 * }
 * }
 */
// public class Main {

/*
 * static int calculate(int... nums) {
 * 
 * int sum = 0;
 * 
 * for (int i = 0; i < nums.length; i++) {
 * 
 * if (nums[i] % 2 == 0) {
 * sum += nums[i++];
 * }
 * }
 * 
 * return sum;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * System.out.println(calculate(2, 4, 6, 8, 10));
 * }
 * }
 */
// public class Main {

/*
 * static void modify(int... nums) {
 * 
 * nums[0] = 100;
 * 
 * nums = new int[] { 50, 60, 70 };
 * }
 */

/*
 * int[] arr = { 10, 20, 30 };
 * 
 * modify(arr);
 * 
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 */

/*
 * int[] b = a;
 * 
 * b[1] = 200;
 * 
 * b = new int[] { 5, 6, 7 };
 * 
 * System.out.println(a[1]);
 * System.out.println(b[1]);
 */
/* import java.util.Arrays;

public class myArrayQ {

    static void ArrayMethod(int[] arr) {

        int temp;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };

        ArrayMethod(a);
    }
} */
import java.util.Arrays;

public class myArrayQ {
    static void reverse(int[] arr) {
        int[] t = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            t[i] = arr[arr.length - 1 - i];
        }
        arr = t;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}