
public class recursionDemo {
    public static void fun(int num) {
        if (num > 0) {
            System.out.print(num);
            fun(num - 1);

        }
    }

    public static void fun2(int num) {
        if (num > 0) {
            fun2(num - 1);
            System.out.print("\t");
            System.out.print(num);

        }

    }

    public static void fun3(int n) {
        if (n > 0) {
            System.out.println("enter:" + n);
            fun3(n - 1);
            System.out.println("exit:" + n);
        }
    }

    public static void main(String args[]) {
        fun(3);
        fun2(5);
        fun3(6);
    }
}
