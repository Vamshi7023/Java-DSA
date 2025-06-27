package queue;

import java.util.*;


public class queue1 {

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);
    // q.add(6);
    // System.out.println(q);

    // // q.remove();
    // // System.out.println(q);
    // // q.poll();//It is having same operation as remove
    // // System.out.println(q);
    // // System.out.println(q.peek());
    // // System.out.println(q.element());//It has same operation as peek
    // // System.out.println(q.size());//returns size
    // // System.out.println(q.isEmpty());//returns true or false

    // Queue<Integer> a = new LinkedList<>();

    // while (q.size()>0) {
    // System.out.println(q.peek());
    // a.add(q.remove());
    // }

    // }

    // Queue implementation by array

    // public static class queue {
    // int r = -1;
    // int f = -1;
    // int size = 0;
    // int arr[] = new int[100];

    // public void add(int val) {
    // if (r == arr.length - 1) {
    // System.out.println("Queue is full");
    // }
    // if (f == -1) {
    // f = r = 0;
    // arr[0]=val;
    // } else {
    // arr[++r] = val;
    // }
    // size++;
    // }

    // public int remove() {
    // if (size==0) {
    // System.out.println("Queue is empty");
    // }
    // f++;
    // size--;
    // return arr[f - 1];

    // }

    // public int peek() {
    // if (size==0) {
    // System.out.println("Queue is empty");
    // }
    // return arr[f];
    // }
    // public void display(){
    // for(int i=f;i<=r;i++){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5, 6 };
    // int n = arr.length;
    // queue a = new queue();
    // a.add(44);
    // a.add(44);
    // a.add(44);
    // a.add(44);
    // a.display();
    // a.remove();
    // a.display();
    // System.out.println(a.pee());
    // }

    // Implementing of Queue using linkedlist

    // public static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // }

    // }

    // public static class queueLinkedlist{
    // Node head = null;
    // Node tail = null;
    // int size =0;

    // public void add(int val){
    // Node temp =new Node(val);
    // if(head==null){
    // head=temp;
    // tail=head;
    // }
    // tail.next=temp;
    // tail=temp;
    // size++;
    // }

    // public int peek(){
    // if(head==null){
    // return -1;
    // }

    // return head.data;
    // }

    // public int remove(){
    // int x = head.data;
    // head=head.next;
    // size--;
    // return x;

    // }

    // public int size(){
    // return size;
    // }

    // public boolean isEmpty(){
    // if(head==null){
    // return true;
    // }

    // return false;
    // }
    // public void display(){
    // if(head==null){
    // System.out.println("NULL");
    // }
    // Node temp = head;
    // while (temp!=null) {
    // System.out.print(temp.data+" ");
    // temp=temp.next;
    // }
    // System.out.println( );

    // }

    // }

    // public static void main(String[] args) {
    // queueLinkedlist a = new queueLinkedlist();
    // a.add(12);
    // a.add(14);
    // a.add(24);
    // a.add(78);

    // System.out.println(a.head);
    // a.remove();
    // System.out.println(a.peek());
    // System.out.println(a.size());
    // System.out.println(a.isEmpty());
    // a.display();
    // System.out.println(a.size);
    // }

    // implementation of circular queue using array
    // public static class circularQueue{
    // int f =-1;
    // int r =-1;
    // int size=0;
    // int arr[]=new int[4];
    // public void add(int x){
    // if(size==arr.length){
    // System.out.println("queue is full");
    // }
    // else if(size==0){
    // f=r=0;
    // arr[0]=x;
    // }

    // else if(r<arr.length-1){
    // arr[++r] = x;
    // }

    // else if(r==arr.length-1){
    // r=0;
    // arr[r]=x;
    // }

    // size++;
    // }

    // public int remove(){
    // // int x = arr[f];
    // // f++;
    // // return x;
    // if(size==0){
    // System.out.println("queue is Empty");
    // return -1;
    // }

    // else if(f==arr.length-1){//when front moves to thte end of arr movee it to 0
    // position of arr
    // int val = arr[f];
    // f=0;
    // size--;
    // return val;
    // }

    // else{
    // int val = arr[f];
    // f++;
    // size--;
    // return val;
    // }

    // }

    // public int peek(){
    // if(size==0){
    // return -1;
    // }
    // return arr[r];
    // }
    // public void display(){
    // if(size==0){
    // System.out.println("no values in arr");
    // }
    // else if(f<=r){
    // for(int i=f;i<=r;i++){
    // System.out.print(arr[i]+" ");
    // }
    // }
    // if(r<f){ //when rare lenthe is n-1 and new added ele are from 0 position r<f
    // is used
    // for(int i=f;i<=arr.length-1;i++){
    // System.out.print(arr[i]+" ");
    // }
    // for(int i=0;i<=r;i++){
    // System.out.println(arr[i]+" ");
    // }

    // }
    // }

    // public boolean isEmpty(){
    // if(size==0){
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    // }

    // public static void main(String[] args) {
    // circularQueue c = new circularQueue();
    // c.add(1);
    // c.add(2);
    // c.add(3);
    // c.add(4);

    // c.display();

    // c.remove();
    // System.out.println();
    // c.display();
    // c.add(5);
    // System.out.println();
    // c.display();

    // c.add(0);
    // }

    // implementation of queue using linkedlist
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularQueueLinkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
                tail.next = head; // Circular link
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // Maintain circular link
            }
            size++;
        }

        public void remove() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return;
            }
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circular link
            }
            size--;
        }

        public int peek() {
            if (size == 0) {
                return -1;
            }
            return head.data;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != head);
        }

        public static void main(String[] args) {
            CircularQueueLinkedlist c = new CircularQueueLinkedlist();
            c.add(0);
            c.add(1);
            c.add(2);
            c.add(3);
            c.add(4);
            c.display();
            System.out.println("Peek: " + c.peek());
            c.remove();
            c.display();
        }
    }

}
