public class CircularLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;
        Node (int data){
            this.data =data;
        }
    }

    // public static void PrintCircularLL(Node head){
    //     Node temp = head;
    //     do {
    //         System.out.println(temp.data);
    //         temp = temp.next;
    //     } while(temp != head);
    // }
    // public static void main(String[] args) {
    //     Node a = new Node(5);
    //     Node b = new Node(10);
    //     Node c = new Node(13);
    //     Node d = new Node(46);
    //     Node e = new Node(20);

    //     a.next = b;
    //     b.next = c;
    //     c.next = d;
    //     d.next = e;
    //     e.next = a;
    //     PrintCircularLL(a);
    // }



    
    
    
    //printing the circular double linkedList


    public static void PrintCircularDLL(Node head){
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while(temp != head);

        System.out.println();
    }
    

    public static void PrintCircularReverseDLL(Node tail){
        Node temp = tail;
        do {
            System.out.println(temp.data);
            temp = temp.prev;
        } while(temp != tail);
    }
    public static void main(String[] args) {
        // 5->10->13->46->20
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(46);
        Node e = new Node(20);

        a.prev = e;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = a;

        PrintCircularDLL(a);
        PrintCircularReverseDLL(a);


        //still need to do from the pw skills web site
    }
}