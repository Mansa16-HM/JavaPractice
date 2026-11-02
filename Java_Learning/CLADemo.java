/* public class Test16 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; 
        // 2147483647;

        int r = max + 1;
        long l = max + 1;
        long m = max + 1L;

        System.out.println(r);
        System.out.println(l);
        System.out.println(m);
    }
} */
/* public class Test16 {
    int x;

    public static void main(String[] args) {
        int y = 90;
        Test16 t = new Test16();

        System.out.println(t.x);
        System.out.println(y);
    }
} */
/* public class Test16 {
    static void test(int day) {
        switch (day) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
            case 3:
                System.out.print("C");
                break;
            case 4:
                System.out.print("D");
            default:
                System.out.print("E");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(2);
        test(4);
        test(9);
    }
} */
/* public class Test16 {
    static void show(int x) {
        System.out.println("int");
    }

    static void show(long x) {
        System.out.println("long");
    }

  /*   static void show(double x) {
        System.out.println("double");
    } */
/* 
    public static void main(String[] args) {
        show('A');
        show(5L);
        show(5.5f);
        show(10.5);
    }
} */
/* public class Test16 {
    public static void main(String[] args) {
        int a = 6, b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
    }
} */
/* public class CLADemo {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0] + args[1]);
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(sum);
    }
} */
public class CLADemo {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0] + args[1]);
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(sum);
    }
}