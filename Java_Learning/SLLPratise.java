public class SLLPratise {
    public static Node insertAtStart(int value, Node currentHead) {
        Node newNode = new Node();// creation of the new value to sending the values
        newNode.data = value;
        newNode.next = null;
        // test case1 head is null- ist is empty

        if (currentHead == null) {
            return newNode;
        } else// list is not empty or thier are 1 or more nodes
        {
            newNode.next = currentHead;
            return newNode;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        System.out.print("head->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static Node GetNthNode(Node head, int n) {
        if (head == null) {
            return null;
        }
        int count = 1;
        while (count < n) {
            count++;
            if (head == null)
                return null;
            head = head.next;
        }
        return head;
    }

    public static int GetNodeCountinSLL(Node head) {
        int NodeCount = 0;
        if (head == null)
            return 0;
        while (head != null) {
            NodeCount++;
            head = head.next;
        }
        return NodeCount;

    }

    public static int getSumOfAllNodes(Node head) {
        if (head == null)
            return 0;
        int NodeDataSum = 0;
        while (head != null) {
            NodeDataSum += head.data;
            head = head.next;
        }
        return NodeDataSum;
    }

    // method for the even position node
    public static int GetTheSumOfEvenNode(Node head) {
        if (head == null)
            return 0;
        int Count = 0;
        int EvenSum = 0;
        while (head != null) {
            Count++;
            if (Count % 2 == 0) {
                EvenSum += head.data;
            }
            head = head.next;
        }
        return EvenSum;
    }

    // method to print the diff between even position node sum and odd position node
    // sum
    public static int GetDiffEvenOddNode(Node head) {
        int Diff = 0;
        if (head == null)
            return 0;
        int evenSum = 0;
        int oddSum = 0;
        int Count = 1;
        while (head != null) {
            if (Count % 2 == 0) {
                evenSum += head.data;

            } else {
                oddSum += head.data;
            }
            Count++;
            head = head.next;
        }
        System.out.println("evenSum " + evenSum);
        System.out.println("oddSum " + oddSum);
        Diff = oddSum - evenSum;
        return Diff;
    }

    /*
     * public int GetValueOfmiddleValue(Node head)
     * {
     * Node middle=null;
     * 
     * }
     */

    public static int Get5thEvenValueSLL(Node head) {
        if (head == null)
            return 0;

        int CountevenNumber = 1;
        int value = 0;
        while (head.next != null) {
            if (head.data % 2 == 0) {
                CountevenNumber++;
            }
            if (CountevenNumber == 5) {
                value = head.data;
                break;
            }
        }

        return value;
    }

    // its helper function to get the last node in the any linked list
    public static Node getLastNode(Node head) {
        if (head == null)
            return null;
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    public static void getCircularLLByUsingSLL(Node list1Head, Node list2Head) {
        if (list1Head == null && list2Head == null)
            return;
        if (list1Head == null || list2Head == null) {
            Node list = null;
            if (list1Head == null) {
                list = list2Head;
            } else {
                list = list1Head;
            }
            Node lastNode = getLastNode(list);
            lastNode.next = list;
            return;
        }
        Node List1Tail = getLastNode(list1Head);
        Node List2Tail = getLastNode(list2Head);
        List1Tail = list2Head;
        List2Tail = list1Head;

    }

    public void getMergeLinkedList(Node list1, Node list2) {
        if (list1 == null && list2 == null)
            return;
        while (list1 != null && list2 != null) {
            if (list1.data > list2.data) {
                list1.next = list2;
                list1 = list1.next;
            } else if (list1.data == list2.data) {
                list1.next = list2.next;
                list1 = list1.next;
                list2 = list2.next;

            } else {
                list2.next = list2;
                list2 = list2.next;
            }
        }

    }

    public static int GetMiddleNodeValue(Node head) {
        if (head == null)
            return 0;
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
        }
        return slow.data;
    }

    public static void main(String args[]) {
        Node head = null;
        // Node CurrentHead=null;
        // function invocation

        /*
         * head = insertAtStart(1, head);
         * 
         * head = insertAtStart(2, head);
         * head = insertAtStart(3, head);
         * head = insertAtStart(4, head);
         * head = insertAtStart(5, head);
         * head = insertAtStart(6, head);
         * head = insertAtStart(7, head);
         * head = insertAtStart(8, head);
         * head = insertAtStart(9, head);
         * head = insertAtStart(10, head);
         */

        printList(head);
        /*
         * Node resultantNthNode = GetNthNode(head, 5);
         * System.out.println("");
         * System.out.println(resultantNthNode.data);
         * 
         * // to get count number of nodes in the SLL
         * int NodeCOunt = GetNodeCountinSLL(head);
         * System.out.println(NodeCOunt);
         * 
         * // to the sum of the data in the SLL
         * int SumOfNodeData = getSumOfAllNodes(head);
         * System.out.println(SumOfNodeData);
         * 
         * // to print the evenPosition Sum in the SLL
         * int SumOfEvenNodeData = GetTheSumOfEvenNode(head);
         * System.out.println(SumOfEvenNodeData);
         */

        /*
         * int Diff = GetDiffEvenOddNode(head);
         * System.out.println(Diff);
         * 
         * int fifthEvenNumber = Get5thEvenValueSLL(head);
         * System.out.println(fifthEvenNumber);
         */

        Node list1Head = null;
        Node list2Head = null;
        list1Head = insertAtStart(1, list1Head);
        list1Head = insertAtStart(3, list1Head);
        list1Head = insertAtStart(5, list1Head);
        list1Head = insertAtStart(7, list1Head);
        list1Head = insertAtStart(9, list1Head);
        // list1Head = insertAtStart(11, list1Head);
        printList(list1Head);
        System.out.println();

        list2Head = insertAtStart(2, list2Head);
        list2Head = insertAtStart(4, list2Head);
        list2Head = insertAtStart(6, list2Head);
        list2Head = insertAtStart(8, list2Head);
        list2Head = insertAtStart(10, list2Head);
        list2Head = insertAtStart(12, list2Head);
        list2Head = insertAtStart(14, list2Head);
        printList(list2Head);

        getCircularLLByUsingSLL(list1Head, list2Head);
        // System.out.println();
        // int MiddleNodeValue = GetMiddleNodeValue(list2Head);
        // System.out.println(MiddleNodeValue);

        GetMiddleNodeValue(list1Head);

    }
}