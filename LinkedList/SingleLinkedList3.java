
public class SingleLinkedList3 {

    // Leetcode problems on linkedList

    // Delete the Nth node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    // public static void DeleteTheNode(Node a) {
    // Node temp = a;
    // a.data = a.next.data;
    // a.next = a.next.next;
    // }

    // public static void main(String[] args) {

    // Node f = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node g = new Node(22);
    // Node h = new Node(23);

    // f.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = g;
    // g.next = h;

    // Node a = b;

    // DeleteTheNode(a);// Deleteing the Node

    // Node temp = f;

    // while (temp != null) {
    // System.out.println(temp.data);

    // temp = temp.next;
    // }

    // }

    // Finding the Nth node from the end and deleting the node

    // public static Node DeleteFromEnd(Node head, int n) {
    // Node temp = head;
    // int size = 0;
    // while (temp != null) {
    // size++;
    // temp = temp.next;
    // }
    // int m = size - n + 1;// For finding the node from last
    // temp = head; // temp will be moved to end when we calculate the size so again
    // it will moved
    // // to front

    // for (int i = 1; i <= m - 1; i++) {
    // temp = temp.next;
    // }

    // return temp;
    // }

    // // More Optimized way

    // public static Node DeleteFromEnd2(Node head, int n) {
    // Node slow = head;
    // Node fast = head;

    // for (int i = 1; i <= n; i++) {
    // fast = fast.next;
    // }

    // while (fast != null) {
    // slow = slow.next;
    // fast = fast.next;
    // }

    // return slow;
    // }

    // public static void main(String[] args) {

    // Node f = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node g = new Node(22);
    // Node h = new Node(23);

    // f.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = g;
    // g.next = h;
    // // Deleting the nth node from the last

    // Node delete = DeleteFromEnd(f, 2);
    // Node delete2 = DeleteFromEnd2(f, 2);// More Optimized way

    // System.out.println(delete.data);
    // System.out.println(delete2.data);

    // }

    // Remove the nth node from the last

    // public static void printLinkedList(Node head) {

    // while (head != null) {
    // System.out.println(head.data);
    // head = head.next;
    // }
    // }

    // public static Node RemovingtheNthNode(Node head, int n) {
    // Node slow = head;
    // Node fast = head;

    // for (int i = 1; i <= n; i++) {
    // fast = fast.next;
    // }

    // if (fast == null) {
    // head = head.next;
    // return head;
    // }
    // while (fast.next != null) {
    // fast = fast.next;
    // slow = slow.next;
    // }
    // slow.next = slow.next.next;

    // return head;
    // }

    // public static void main(String[] args) {
    // Node f = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node g = new Node(22);
    // Node h = new Node(23);

    // f.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = g;
    // g.next = h;

    // Node k = RemovingtheNthNode(f, 4);
    // printLinkedList(k);
    // }

    // Find the intersection of the two linkeList

    // public static Node intersection(Node head1, Node head2) {
    // Node temp1 = head1;
    // Node temp2 = head2;

    // int lengthA = 0;
    // while (temp1 != null) {
    // lengthA++;
    // temp1 = temp1.next;
    // }
    // temp1 = head1;
    // int lengthB = 0;
    // while (temp2 != null) {
    // lengthB++;
    // temp2 = temp2.next;
    // }
    // temp2 = head2;

    // if (lengthA > lengthB) {
    // int steps = lengthA - lengthB;

    // for (int i = 1; i <= steps; i++) {
    // temp1 = temp1.next;
    // }
    // }

    // else {
    // int steps = lengthB - lengthA;

    // for (int i = 1; i <= steps; i++) {
    // temp2 = temp2.next;
    // }
    // }

    // while (temp1 != temp2) {
    // temp1 = temp1.next;
    // temp2 = temp2.next;
    // }

    // return temp1;
    // }

    // public static void main(String[] args) {
    // Node f = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node g = new Node(22);
    // Node h = new Node(23);

    // f.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = g;
    // g.next = h;

    // // LikedList

    // Node i = new Node(15);
    // Node j = new Node(18);

    // i.next = j;
    // j.next = e;// Intersection point

    // Node z = intersection(f, i);

    // System.out.println(z.data);

    // }

    // Finding the mid point of the linkedlist

    // Long process method
    // public static Node Mid(Node head) {
    // Node temp = head;
    // Node Slow = head;
    // Node fast = head;
    // int count = 0;
    // while (temp != null) {
    // count++;
    // temp = temp.next;
    // }
    // temp = head;

    // if (count % 2 == 0) {
    // while (fast != null) {// Right middle in the even number of list
    // Slow = Slow.next;
    // fast = fast.next.next;
    // }
    // while (fast.next.next != null) {// For finding the left middle in the even
    // number of linkedlist

    // Slow = Slow.next;
    // fast = fast.next.next;
    // }

    // } else {
    // while (fast.next != null) {
    // Slow = Slow.next;
    // fast = fast.next.next;
    // }
    // }

    // return Slow;
    // }

    // Short Process
    // public static Node Mid2(Node head) {
    // Node slow = head;
    // Node fast = head;

    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // return slow;
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;

    // // Node i = Mid(f); // Long process
    // // System.out.println(i.data);

    // // Short Process
    // Node j = Mid2(f);
    // System.out.println(j.data);

    // }

    // Delete the middle element in the linkedlist

    // public static void print(Node head) {
    // while (head.next != null) {
    // System.out.println(head.data);
    // head = head.next;
    // }
    // }

    // public static Node DeleteMid(Node head) {

    // // if the elemtnt in the linkedlist id only one
    // if (head.next == null) {
    // return null;
    // }

    // Node slow = head;
    // Node fast = head;

    // while (fast.next.next != null && fast.next.next.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // slow.next = slow.next.next;

    // return head;

    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;

    // Node h = DeleteMid(a);

    // print(h);

    // }

    // Cycle in a linked List

    // public static void cycle(Node head){
    // Node slow = head;
    // Node fast = head;

    // if(slow!=head){
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // else{
    // System.out.println("Cycle exist");
    // }
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = d;

    // cycle(a);//Solved in leetcode in the better way
    // }

    // Write a code for returnig the element at which cycle is created

    // public static Node Cycle(Node head,int index) {
    // Node fast = head;
    // Node slow = head;
    // while (fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // if (slow == fast)
    // break;
    // }
    // Node temp = head;
    // int count =0;
    // while (temp != slow) {
    // temp = temp.next;
    // slow = slow.next;
    // count++;
    // }
    // System.out.println(count);
    // return slow;
    // }//refer leetcode once for tle error

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = b;
    // int count =0;
    // Node q = Cycle(a,count);

    // System.out.println(q.data);
    // }

    // Write a code for mergeing the two sorted linkedlist

    public static void Sort(Node list1, Node list2) {
    Node head = new Node(100);
    Node temp = head;
    while (list1 != null && list2 != null) {
    if (list1.data < list2.data) {
    Node a = new Node(list1.data);
    temp.next = a;
    temp = a;
    list1 = list1.next;
    } else {
    Node a = new Node(list2.data);
    temp.next = a;
    temp = a;
    list2 = list2.next;
    }

    if (list1 == null) {
    temp.next = list2;
    } else {
    temp.next = list1;
    }
    }

    temp = head.next;

    while (temp != null) {
    System.out.println(temp.data);
    temp = temp.next;
    }
    }

    public static void main(String[] args) {
    // Sorted LinkedList 1
    Node a = new Node(5);
    Node b = new Node(10);
    Node c = new Node(25);
    Node d = new Node(30);
    // Sorted LinkedList 2
    Node e = new Node(1);
    Node f = new Node(12);
    Node g = new Node(23);
    Node h = new Node(40);

    a.next = b;
    b.next = c;
    c.next = d;

    e.next = f;
    f.next = g;
    g.next = h;
    Sort(a, e);
    }

    // Merging two sorted linkedlist wwithout using extra space

    // public static void Merge(Node list1, Node list2) {
    // Node head = new Node(0);
    // Node temp = head;

    // while (list1 != null && list2 != null) {
    // if (list1.data < list2.data) {
    // temp.next = list1;
    // temp = list1;
    // list1 = list1.next;
    // } else {
    // temp.next = list2;
    // temp = list2;
    // list2 = list2.next;
    // }
    // }

    // if (list1 == null) {
    // temp.next = list2;
    // } else {
    // temp.next = list1;
    // }
    // temp = head.next;

    // while (temp != null) {
    // System.out.println(temp.data);
    // temp = temp.next;
    // }
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(25);
    // Node d = new Node(30);
    // // Sorted LinkedList 2
    // Node e = new Node(1);
    // Node f = new Node(12);
    // Node g = new Node(23);
    // Node h = new Node(40);

    // a.next = b;
    // b.next = c;
    // c.next = d;

    // e.next = f;
    // f.next = g;
    // g.next = h;

    // Merge(a, e);
    // }

    // Given a linked list split it into two lists such that one contains odd
    // values while the other contains even values

    // public static void Split(Node head) {
    //     Node list1 = new Node(0);
    //     Node temp1 = list1;

    //     Node list2 = new Node(0);
    //     Node temp2 = list2;

    //     while (head != null) {
    //         if (head.data % 2 == 0) {
    //             temp1.next = head;
    //             temp1 = head;
    //             head = head.next;
    //         } else {
    //             temp2.next = head;
    //             temp2 = head;
    //             head = head.next;

    //         }
    //     }

    //     temp1.next = null;reverse
    //     temp2.next = null;

    //     temp1 = list1.next;

    //     while (temp1 != null) {
    //         System.out.println(temp1.data);
    //         temp1 = temp1.next;
    //     }

    //     System.out.println("Odd numbers");
    //     temp2 = list2.next;
    //     while (temp2 != null) {
    //         System.out.println(temp2.data);
    //         temp2 = temp2.next;
    //     }

    // }

    // public static void main(String[] args) {
    //     Node a = new Node(5);
    //     Node b = new Node(10);
    //     Node c = new Node(25);
    //     Node d = new Node(30);

    //     // Sorted LinkedList 2
    //     Node e = new Node(1);
    //     Node f = new Node(12);
    //     Node g = new Node(23);
    //     Node h = new Node(40);

    //     a.next = b;
    //     b.next = c;
    //     c.next = d;
    //     d.next = e;
    //     e.next = f;
    //     f.next = g;
    //     g.next = h;

    //     Split(a);
    // }

    // Reverse a linked list using recursion

    // public static void recursivPrint(Node head) {// Printing the Linked List
    // using recursion

    // if (head == null)
    // return;

    // System.out.print(head.data + " ");

    // recursivPrint(head.next);
    // }

    // public static Node Reverce(Node head) {
    // if (head.next == null) {
    // return head;
    // }

    // Node rev = Reverce(head.next);

    // head.next.next = head;

    // head.next = null;

    // return rev;
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;
    // g.next = null;

    // a = Reverce(a);

    // recursivPrint(a);
    // }

    // Reversing the linkedlist using iterative approch

    // public static void Display(Node head) {
    // while (head != null) {
    // System.out.println(head.data);
    // head = head.next;
    // }
    // }

    // public static Node ReverseWithIteration(Node head) {

    // Node current = head;

    // Node Next = null;

    // Node previous = null;
    // while (current != null) {

    // Next = current.next;

    // current.next = previous;

    // previous = current;

    // current = Next;

    // }

    // return previous;

    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;
    // g.next = null;

    // Node z = ReverseWithIteration(a);

    // Display(z);

    // }

    // Pallandrom of the given linkedlist

    // 1 -> 2 -> 3 ->3 -> 2-> 1

    // Step 1 find the left middle element . //2

    // Step 2 reverse the left+1 to the end of the linked list.1-> 2->3 -> 1->2 ->3

    // Step 3 compare the element with pointers p1 and p2 one from 1 position other
    // from middle +1 if every element is same then its a pallendrom other wise its
    // not a pallandrom

    public static Node ReverseWithIteration(Node head) {

    Node current = head;

    Node Next = null;

    Node previous = null;
    while (current != null) {

    Next = current.next;

    current.next = previous;

    previous = current;

    current = Next;

    }

    return previous;

    }

    // public static void Pallandrom(Node head) {
    // Node fast = head;
    // Node slow = head;

    // //Finding the left middle
    // while (fast.next != null && fast.next.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // //Reverse the linked list
    // Node temp = ReverseWithIteration(slow.next);
    // slow.next = temp;

    // //assigning the two pointers
    // Node p1 = head;
    // Node p2 = slow.next;

    // //Compareing the values and getting the output
    // while (p2 != null) {
    // if (p1.data == p2.data) {
    // System.out.println("Its a pallindrome");
    // return;
    // }
    // p1 = p1.next;
    // p2 = p2.next;
    // }
    // System.out.println("Not a paalindrome");
    // }

    // public static void main(String[] args) {
    // Node a = new Node(1);
    // Node b = new Node(2);
    // Node c = new Node(3);
    // Node e = new Node(3);
    // Node f = new Node(2);
    // Node g = new Node(1);

    // a.next = b;
    // b.next = c;
    // c.next = e;
    // // d.next = e;
    // e.next = f;
    // f.next = g;
    // g.next = null;

    // Pallandrom(a);
    // }

    // Maximum twin sum of a linkedlist

    // TWINSUM -> 1-> 3-> 4-> 5 -> 6->7

    // add the 1 position ele with last

    // add second position with second last

    // Add third position with third last

    // compare all the values which value is biiger then each other it is the twin
    // sum

    // public static Node ReverseWithIteration(Node head) {

    // Node current = head;

    // Node Next = null;

    // Node previous = null;
    // while (current != null) {

    // Next = current.next;

    // current.next = previous;

    // previous = current;

    // current = Next;

    // }

    // return previous;

    // }

    // public static int Twinsum(Node head) {

    // Node fast = head;
    // Node slow = head;
    // while (fast.next != null && fast.next.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }
    // Node temp = ReverseWithIteration(slow.next);
    // slow.next = temp;
    // Node p1 = head;
    // Node p2 = slow.next;
    // int count = 0;

    // while (p2 != null) {
    // int z = p1.data + p2.data;
    // if (z > count) {
    // count = z;
    // }
    // p1 = p1.next;
    // p2 = p2.next;
    // }

    // return count;
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;
    // g.next = null;

    // System.out.println(Twinsum(a));
    // }

    // Odd even linked List

    // Creating all the odd placed linkedlist

    // creating all the even placed linkedlist
    // public class Node{
    // int data;
    // Node next;
    // Node(int data){
    // this.data=data;
    // }
    // }
    // public static void OddEven(Node head) {
    // Node even = new Node(0);
    // Node odd = new Node(0);

    // Node temp = head;

    // Node tempo = odd;

    // Node tempe = even;

    // while (temp != null) {
    // tempo.next = temp;
    // temp = temp.next;
    // tempo = tempo.next;

    // tempe.next = temp;

    // if (temp == null)
    // break;
    // temp = temp.next;
    // tempe = tempe.next;
    // }

    // odd = odd.next;

    // even = even.next;

    // System.out.println("Odd linkedList");
    // while (odd != null) {

    // System.out.print(odd.data + " ");

    // odd = odd.next;
    // }

    // System.out.println();
    // System.out.println("Even LinkedList");

    // while (even != null) {
    // System.out.print(even.data + " ");

    // even = even.next;
    // }
    // }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(13);
    // Node d = new Node(46);
    // Node e = new Node(21);
    // Node f = new Node(22);
    // Node g = new Node(23);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = f;
    // f.next = g;
    // g.next = null;

    // OddEven(a);
    // }
}