public class ArrayDemo {
    public static void main(String args[]) {
        myArray Arr = new myArray();

        System.out.println("After inserting at position!");
        Arr.insertAtPostision(15, 0);
        // Arr.printElements();
        Arr.inserAtStart(5);
        Arr.inserAtStart(15);
        Arr.inserAtStart(60);

        Arr.insertAtPostision(90, 4);
        Arr.printElements();

        System.out.println("after deleting the array elemenst");
        Arr.deleteAtStart();
        Arr.deleteFromEnd();

        Arr.deleteAtAnyPosition(1);
        Arr.printElements();

    }
}