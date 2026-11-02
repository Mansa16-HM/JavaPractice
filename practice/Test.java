class Box {
    int value;
}

public class Test {
    public static void update(Box b, int x) {
        b.value = b.value + 10;
        x = x + 10;
        b = new Box();
        b.value = 999;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.value = 5;
        int n = 5;

        update(box, n);

        System.out.println(box.value);
        System.out.println(n);
    }
}