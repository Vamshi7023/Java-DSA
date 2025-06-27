

public class SingleLinkedList {

    public static int length(Node head){
        int count =0;
        while(head != null){
            count++;
            head = head.address;
        }
        return count;
    }

    public static void recursivPrint(Node head){//Printing the Linked List using recursion
        if(head == null) return ;

        System.out.print(head.data+" ");

        recursivPrint(head.address);
    }

    public static void PrintNode(Node head){//Printing the node using function
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");

            temp = temp.address;
        }
    }


    public static class Node{
        int data;
        Node address;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(46);
        Node e = new Node(20);

        a.address = b;
        b.address = c;
        c.address = d;
        d.address = e;

        //Displaying the LinkedList

        Node temp = a; //Assigning the temp value as a

        while(temp!=null){
            System.out.print(temp.data+ " ");

            temp = temp.address;
        }
        System.out.println();
        System.out.println();


        //Printing the node using function
        System.out.println("Print Using Function");
        PrintNode(a);
        System.out.println();
        System.out.println();


        //Printing the Linked List using Recursion
        System.out.println("Printing the Linked List using Recursion");
        recursivPrint(a);
        System.out.println();
        System.out.println();


        //Printing the length of the linked list
        System.out.println("Lenght of the linked list");
        System.out.println(length(a));
    }
}
