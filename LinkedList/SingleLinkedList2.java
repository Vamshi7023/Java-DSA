
public class SingleLinkedList2 {

    // Adding the element in the linked list

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class LinkedList{
        Node head  = null;
        Node tail = null;



        //Incert an element at the end of the linkedList




        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head==null){
                head = temp;
            }

            else{
                tail.next = temp;
            }

            tail = temp;
        }



        //Insert an element at the begining of the linkedList


        void InsertAtBegining(int val){
            Node temp = new Node(val);

            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }




        //Insering an element at a given particular index

        void InsertatIndex(int idx,int val){
            Node T = new Node(val);
                Node temp = head;
                if(idx == size()){
                    insertAtEnd(val);
                    return;
                }
                if(idx==0){
                    InsertAtBegining(val);
                    return;
                }
                for(int i=0;i<idx-1;i++){
                    temp = temp.next;
                }
                T.next = temp.next;
                temp.next=T;
        }



        //Getting an element from the perticular index
        int get(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;

        }

        int size(){
            Node temp = head;
            int count=0;
            while (temp!=null) {
                count++;
                temp = temp.next;
                
            }
            return count;
        }





        void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(6);
        ll.insertAtEnd(23);

        ll.InsertAtBegining(10);


        ll.InsertatIndex(3, 11);
        System.out.println(ll.size());
        ll.Display();
        System.out.println();
        System.out.println(ll.get(0));
        System.out.println(ll.head.data); // To print head of the linked list

    }

}
