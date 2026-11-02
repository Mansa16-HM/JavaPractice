import java.util.List;

public class SinglyLinkedList {
    // Function defination
    public static Node insertAtStart(int value, Node currentHead) {
        Node newNode = new Node();// creation of the new value to sending the values
        newNode.data = value;
        newNode.next = null;
        // test case1 head is null- ist is empty
        /*
         * if(currentHead==null)
         * {
         * return newNode;
         * }
         * else//list is not empty or thier are 1 or more nodes
         * {
         * newNode.next=currentHead;
         * return newNode;
         * }
         */

        if (currentHead != null) {
            newNode.next = currentHead;
        }
        return newNode;
    }

    static void afterKey(Node CurrentHead, int key, int value) {
        Node MidValue = new Node();
        MidValue.data = value;
        MidValue.next = null;
        MidValue.key = key;

        if (CurrentHead == null) {
            return;
        }
        if (CurrentHead.data == key) {
            CurrentHead.next = MidValue;
            return;
        }
        Node keyNode = CurrentHead;
        while (keyNode != null && keyNode.data != key) {
            keyNode = keyNode.next;

        }
        if (keyNode == null) {
            return;
        }

        MidValue.next = keyNode.next;
        keyNode.next = MidValue;
    }

    public static void printList(Node head) {
        Node temp = head;
        System.out.print("head->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    /*
     * public static Node insertAtEnd(int Value,Node CurrentHead)
     * {
     * Node newNode=new Node();
     * newNode.data=Value;
     * newNode.next=null;
     * Node temp=CurrentHead;
     * while (temp.next != null)
     * {
     * temp = temp.next;
     * 
     * }
     * 
     * temp.next = newNode;
     * // return newNode;
     * }
     */
    /*
     * public static void printingTheList(Node currentHead)
     * {
     * Node temp=currentHead;
     * System.out.print("head->");
     * while(temp!=null)
     * {
     * System.out.print(temp.data+"->");
     * temp=temp.next;
     * }
     * System.out.print("null");
     * }
     */
    /*
     * static Node insertEnd(Node CurrentHead, int value) {
     * Node lastNode = new Node();
     * lastNode.data = value;
     * lastNode.next = null;
     * 
     * Node CurrentLastNode = CurrentHead;
     * if (CurrentHead == null) {
     * return lastNode;
     * }
     * if (CurrentHead.next == null) {
     * CurrentHead.next.next = lastNode;
     * }
     * return CurrentHead;
     * 
     * while (CurrentLastNode.next != null) {
     * CurrentLastNode = CurrentLastNode.next;
     * }
     * CurrentLastNode.next = lastNode;
     * 
     * return CurrentHead;
     * }
     */
    // Node prevNode=CurrentHead;

    // public static void testDeleteOperations(Node head)
    public static Node deleteAtStart(Node head) {
        if (head == null) {
            System.out.println("list is empty");
            return null;
        }
        return head.next;
        // public static void testDeleteOperations(Node head)
    }

    public static Node deleteAtEnd(Node head)

    {
        if (head == null || head.next == null) {
            return null;
        }
        Node LastButOne = head;
        while (LastButOne.next.next != null) {
            LastButOne = LastButOne.next;
        }
        LastButOne.next = null;

        return head;
    }

    public static Node deleteKeyNode(Node head, int key) {
        // empty List
        if (head == null)
            // System.out.println("List is not having the key");
            return null;
        if (head.data == key) {
            return head.next;
        }

        Node keyNode = head;
        Node PrevNode = null;
        while (keyNode != null) {
            if (keyNode.data == key)
                break;
            PrevNode = keyNode;
            keyNode = keyNode.next;
        }

        if (keyNode != null && keyNode.data == key) {
            PrevNode.next = keyNode.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        // Node CurrentHead=null;
        // function invocation
        head = insertAtStart(500, head);
       

        head = insertAtStart(506, head);
        head = insertAtStart(507, head);
        head = insertAtStart(505, head);
        head = insertAtStart(503, head);
        head = insertAtStart(502, head);
        printList(head);

       /*   CurrentHead=insertEnd(1000,CurrentHead);
         Node CurrentHead = null;
         afterKey(CurrentHead, 502, 1000);
         *//*
         * System.out.println();
         * // printList(head);
         * head = deleteAtStart(head);
         * printList(head);
         * System.out.println();
         * head = deleteAtEnd(head);
         * printList(head);
         * System.out.println();
         */

        // head = deleteKeyNode(head, 50);
        /*
         * head = deleteKeyNode(head, 0);
         * head = deleteKeyNode(head, 503);
         * head = deleteAtStart(head);
         */
        //printList(head);

       // List is empty

       // singleNode key present


       //singleNode key not present


       //two node  key not present


       // two node key key first


       // two node key key second


       //three Node key not found 


       // three Node key at first


       // three Node key at middle

       
       // three Node key at last



    }
}