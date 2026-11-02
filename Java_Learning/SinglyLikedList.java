public class SinglyLikedList {
    public static void main(String args[])
    {
        int head=firstNode;
    Node firstNode=new Node();
    firstNode.data=101;
    firstNode.next=null;
    System.out.println( firstNode.next);
    System.out.println (firstNode.data);
    Node SecondNode=new Node();
    SecondNode.data=102;
    SecondNode.next=null;
    System.out.println( SecondNode.next);
    System.out.println( SecondNode.data);
  
     //firstNode.next=SecondNode;//connect 1st to 2nd 
     
    Node thirdNode=new Node();
    thirdNode.data=103;
     //SecondNode.data=102;
    thirdNode.next=null;
    System.out.println( thirdNode.next);
    System.out.println( thirdNode.data);
  

   // creating the node to insert at the begining
     Node BeginNode=new Node();
    BeginNode.data=110;
    BeginNode.next=null;
    System.out.println(BeginNode.next);
    System.out.println( BeginNode.data);
    
    // first node to begin node
    BeginNode.next=firstNode;

    //creating the first node to the head
    firstNode=BeginNode;
  
     System.out.println(BeginNode.data);
     System.out.println(BeginNode.next);



    /* System.out.println(firstNode.next.next);
    System.out.println(firstNode.next.next.next); */



    

    }
}
