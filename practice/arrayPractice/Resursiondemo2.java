public class Resursiondemo2 {
    public static void fun(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        fun(num - 1);

    }

    public static int GetFunctionCallCount(int num) {
        int CallCount = 0;
        if (num >= 1) {
            System.out.println(num);
            CallCount++;
            GetFunctionCallCount(num - 1);
        }

        return CallCount;
    }

    public static void main(String[] args) {
        // fun(5);
        GetFunctionCallCount(5);
    }
}
