public class ArrayDemoMain {
   public static void main(String args[]) {
      PracArray Arr = new PracArray();

      System.out.println("Intial Array elements");
      Arr.PrintElements();

      System.out.println("after inserting the 10 and 20 from The end");
      Arr.insertAtEnd(100);
      Arr.insertAtEnd(20);
      Arr.PrintElements();

      System.out.println("after inserting the 15 and 25 from The start");
      // Arr.insertAtStart(15);
      Arr.insertAtStart(15);
      Arr.insertAtStart(25);
      Arr.PrintElements();

      System.out.println("After insert the elemenst at any position");
      Arr.insertAtAnyPos(2, 12);
      Arr.insertAtAnyPos(4, 24);
      Arr.PrintElements();

      // Arr.insertAtStart(25);

      Arr.deleteFromEnd();
      Arr.deleteFromEnd();
      Arr.PrintElements();

      Arr.deleteFromStart();
      Arr.deleteFromStart();
      Arr.PrintElements();

   }
}
