public class StackDemo {
    public static void main(String args[]) {
        ArrayStack2 ArrObj = new ArrayStack2();
        ArrObj.push(10);

        ArrObj.push(20);
        ArrObj.push(30);
        ArrObj.push(40);
        ArrObj.push(50);
        ArrObj.push(60);
        ArrObj.display();

        // pop the
        // System.out.println("Popping /deleting the element");
        int pop1 = ArrObj.pop();
        System.out.println("Popping /deleting the element is " + pop1);
        int pop2 = ArrObj.pop();
        System.out.println("Popping /deleting the element is " + pop2);
        /*
         * ArrObj.pop();
         * ArrObj.pop();
         */
        ArrObj.display();

        System.out.println("Peek the element");
        ArrObj.peek();
        // ArrObj.display();

        int peek1 = ArrObj.peek();
        System.out.println("Peek value is" + peek1);

        ArrObj.display();

    }

}
