public class VarargsOverloadTest {

    static void test(int a) {
        System.out.println("fixed");
    }

    static void test(int... a) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        test(5);
        test(5);
        test(5, 765, 876, 987);
    }
}