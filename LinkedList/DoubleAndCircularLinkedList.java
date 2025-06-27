public class DoubleAndCircularLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    
    // public static void display(Node head){
    //     Node temp =head;
    //     while (temp!=null) {
    //         System.out.print(temp.data + " ");
    //         temp=temp.next;
    //     }

    //     System.out.println();
    // }

    // public static void displayrandom(Node Random){
    //     //diplying complete linkedList from any node
    //     Node temp = Random;
    //     while(temp.prev!=null){
    //         temp=temp.prev;
    //     }
    //     while (temp!=null) {
    //         System.out.print(temp.data + " ");
    //         temp=temp.next;
    //     }
    // }

    

    // public static void displayrev(Node tail){
    //     Node temp =tail;
    //     while (temp!=null) {
    //         System.out.print(temp.data +" ");
    //         temp=temp.prev;
    //     }
    // }
    // public static void main(String[] args) {
    //     //10->12->23->22
    //     Node a = new Node(10);
    //     Node b = new Node(12);
    //     Node c = new Node(23);
    //     Node d = new Node(22);
    //     a.prev=null;
    //     a.next = b;
    //     b.prev=a;
    //     b.next =c;
    //     c.prev=b;
    //     c.next =d;
    //     d.prev=c;
    //     d.next = null;

    //     // display(a);
    //     // displayrev(d);
    //     displayrandom(c);
    // }



    //Insertion at first or head

    // public static void display(Node head){
    //     Node temp = head;
    //     while(temp!= null){
    //         System.out.println(temp.data+" ");

    //         temp = temp.next;
    //     }
    // }

    // public static void Insertathead(Node head,int x){
    //     Node temp = head;
    //     Node t = new Node(x);

    //     t.next=head;
    //     head.prev = t;
    //     head = t;

    //     display(head);
    // }
    // public static void main(String[] args) {
    //     Node a = new Node(10);
    //     Node b = new Node(12);
    //     Node c = new Node(23);
    //     Node d = new Node(22);
    //     a.prev=null;
    //     a.next = b;
    //     b.prev=a;
    //     b.next =c;
    //     c.prev=b;
    //     c.next =d;
    //     d.prev=c;
    //     d.next = null;

    //     Insertathead(a,30);
    // }




    //Inser at end of the Double LinkedList

    // public static void display(Node head){
    //     Node temp = head;
    //     while(temp!= null){
    //         System.out.println(temp.data+" ");

    //         temp = temp.next;
    //     }
    // }

    // public static void InsertAtEnd(Node head,int x){
    //     Node temp = head;
    //     Node t = new Node(x);
    //     while(temp.next!=null){
    //         temp=temp.next;
    //     }
    //     temp.next=t;
    //     t.prev=temp;

    //     temp = t;

    //     display(head);
    // }

    // public static void main(String[] args) {
        
    //     Node a = new Node(10);
    //     Node b = new Node(12);
    //     Node c = new Node(23);
    //     Node d = new Node(22);
    //     a.prev=null;
    //     a.next = b;
    //     b.prev=a;
    //     b.next =c;
    //     c.prev=b;
    //     c.next =d;
    //     d.prev=c;
    //     d.next = null;

    //     InsertAtEnd(a, 30);
    // }




    //Insert at any given Index

    public static void display(Node head){
        Node temp =head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Displaying the linked list in reverse order 


    public static void displayrev(Node tail){
        Node temp =tail;
        while (temp!=null) {
            System.out.print(temp.data +" ");
            temp=temp.prev;
        }
    }

    public static void InsertAtGivenIndex(Node head ,int idx,int x){
        Node temp = head;

        for(int i=1;i<idx-1;i++){
            temp= temp.next;
        }

        Node t = new Node(x);

        temp.next.prev = t;
        t.prev = temp;
        t.next =temp.next;
        temp.next = t;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(23);
        Node d = new Node(22);
        a.prev=null;
        a.next = b;
        b.prev=a;
        b.next =c;
        c.prev=b;
        c.next =d;
        d.prev=c;
        d.next = null;

        InsertAtGivenIndex(a, 3, 3);

        display(a);

        displayrev(d);
    }
}
