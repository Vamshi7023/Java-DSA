public class randomlinkedlistproblem {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Sort(Node list1, Node list2) {
        Node head = new Node(100);

        Node temp = head;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                Node a = new Node(list1.data);

                temp.next = a;

                temp = a;

                list1 = list1.next;
            }

            else {
                Node a = new Node(list2.data);

                temp.next = a;

                temp = a;

                list2 = list2.next;
            }

        }

        if (list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }

        temp = head.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
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

}
